package com.snail.DBUtil;

import com.snail.action.*;

import java.util.ArrayList;
import java.util.List;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

public class userDBUtil {
	private static SessionFactory factory;
	
	public static List findUserByName(String userName) {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "FROM User U WHERE U.userName = :user_name";
		Query query = session.createQuery(hql);
		query.setParameter("user_name",userName);
		List results = query.list();
		System.out.println("Find record number = " + results.size());
		
		tx.commit();
		session.close();
		factory.close();
		return results;
	}
	
	public static void insertUser(User user) {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(user);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Exit from insertUser");
	}
	
	public static List getAllUser() {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		List userList = session.createQuery("FROM User").list();
		
		tx.commit();
		session.close();
		factory.close();
		return userList;
	}
	
	public static void deleteUserByName(String userName) {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		String hql = "DELETE FROM User WHERE userName = :user_name";
		Query query = session.createQuery(hql);
		query.setParameter("user_name", userName);
		int result = query.executeUpdate();
		System.out.println("deleteUserByName return with " + result);
		
		tx.commit();
		session.close();
		factory.close();
	}
}
