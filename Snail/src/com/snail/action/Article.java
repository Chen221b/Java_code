package com.snail.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.snail.DBUtil.articleDBUtil;

public class Article {
	private Article article;
	private List articleList;
	private int articleId;
	private int userId;
	private String articleTittle;
	private int articleClick;
	private int articleLike;
	private String articleAddress;
	private int articleScan;
	private String articleContent;

	public Article() {}
	
	public String getAllArticle() {
		articleList = new ArrayList<Article>();
		List articles = articleDBUtil.getArticle();
		System.out.println(articles.size());
		for(Iterator iter = articles.iterator(); iter.hasNext();) {
			Article a = (Article) iter.next();
			articleList.add(a);
		}
		return "success";
	}
	
	public String publish() {
		HttpServletRequest request = ServletActionContext.getRequest();
		try {
			request.setCharacterEncoding("utf-8");
			article = new Article();
			article.setArticleTittle(request.getParameter("articleTittle"));
			article.setArticleAddress(request.getParameter("articleAddress"));
			article.setArticleContent(request.getParameter("articleContent"));
			System.out.println(request.getParameter("articleContent"));
			article.setUserId(Integer.parseInt(request.getParameter("userId")));
			articleDBUtil.insertArticle(article);
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}

	public Article getArticle() {
		return article;
	}
	
	public String getArticleContent() {
		return articleContent;
	}



	public void setArticleContent(String articleContent) {
		this.articleContent = articleContent;
	}


	public void setArticle(Article article) {
		this.article = article;
	}

	public List getArticleList() {
		return articleList;
	}

	public void setArticleList(List articleList) {
		this.articleList = articleList;
	}

	public int getArticleId() {
		return articleId;
	}

	public void setArticleId(int articleId) {
		this.articleId = articleId;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getArticleTittle() {
		return articleTittle;
	}

	public void setArticleTittle(String articleTittle) {
		this.articleTittle = articleTittle;
	}

	public int getArticleClick() {
		return articleClick;
	}

	public void setArticleClick(int articleClick) {
		this.articleClick = articleClick;
	}

	public int getArticleLike() {
		return articleLike;
	}

	public void setArticleLike(int articleLike) {
		this.articleLike = articleLike;
	}

	public String getArticleAddress() {
		return articleAddress;
	}

	public void setArticleAddress(String articleAddress) {
		this.articleAddress = articleAddress;
	}

	public int getArticleScan() {
		return articleScan;
	}

	public void setArticleScan(int articleScan) {
		this.articleScan = articleScan;
	}
	
	
}
