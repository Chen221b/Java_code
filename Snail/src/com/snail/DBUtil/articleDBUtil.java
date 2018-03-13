package com.snail.DBUtil;

import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.snail.action.Article;

public class articleDBUtil {
	private static SessionFactory factory;
	
	public static void insertArticle(Article article) {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		session.save(article);
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Exit from insertArticle");
	}
	
	public static List getArticle() {
		factory = new Configuration().configure().buildSessionFactory();
		Session session = factory.openSession();
		Transaction tx = session.beginTransaction();
		
		List articles = session.createQuery("FROM Article").list();
		
		tx.commit();
		session.close();
		factory.close();
		System.out.println("Exit from getArticle");
		return articles;
	}
}
