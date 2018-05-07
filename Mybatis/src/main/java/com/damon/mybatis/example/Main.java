package com.damon.mybatis.example;

import org.apache.ibatis.session.SqlSession;

public class Main {
    public static void main(String[] args){
        SqlSession sqlSession;
        sqlSession = SqlSessionFactoryUtils.openSqlSession();
        RoleMapper roleMapper = sqlSession.getMapper(RoleMapper.class);
        Role role = roleMapper.getRole(3L);
        System.out.println(role);
    }
}
