package com.damon.mybatis.example;

import org.apache.ibatis.io.Resources;
import org.apache.ibatis.session.SqlSession;
import org.apache.ibatis.session.SqlSessionFactory;
import org.apache.ibatis.session.SqlSessionFactoryBuilder;

import java.io.IOException;
import java.io.InputStream;

public class SqlSessionFactoryUtils {
    /*同步锁变量，所有对象引用共享一把锁*/
    private final static Class<SqlSessionFactoryUtils> LOCK = SqlSessionFactoryUtils.class;

    private static SqlSessionFactory sqlSessionFactory;

    /*单例模式,私有化确保外界无法通过new创建对象*/
    private SqlSessionFactoryUtils(){}

    public static SqlSessionFactory getSqlSessionFactory(){
        synchronized (LOCK){
            if(sqlSessionFactory == null){
                String resource = "mybatis-config.xml";
                InputStream inputStream;
                try {
                    inputStream = Resources.getResourceAsStream(resource);
                    sqlSessionFactory = new SqlSessionFactoryBuilder().build(inputStream);
                } catch (IOException e) {
                    e.printStackTrace();
                    return null;
                }
            }
            return sqlSessionFactory;
        }
    }

    public static SqlSession openSqlSession(){
        if(sqlSessionFactory == null){
            getSqlSessionFactory();
        }
        return sqlSessionFactory.openSession();
    }
}
