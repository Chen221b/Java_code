package com.snail.action;

import java.io.UnsupportedEncodingException;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.struts2.ServletActionContext;

import com.snail.DBUtil.userDBUtil;

public class User {
	private User user;
	private List userList;
	private int userId;
	private String userName;
	private String userPass;
	private int userType;
	private int userFans;
	private int userFocus;
	private String userPhoto;

	private int userRank;
	
	public User(){}
	
	public String nothing() {
		return "success";
	}
	
	public String loginByName() {
		userList = new ArrayList<User>();
		HttpServletRequest request = ServletActionContext.getRequest();
		try {
			request.setCharacterEncoding("utf-8");
			List users = userDBUtil.findUserByName(request.getParameter("username"));
			for(Iterator iter = users.iterator(); iter.hasNext();) {
				User u = (User) iter.next();
				if(u.userPass.equals(request.getParameter("userpass"))){
					userList.add(u);
				}
			}
		} catch (UnsupportedEncodingException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		return "success";
	}
	
	public String registerByNamePass() {
		HttpServletRequest request = ServletActionContext.getRequest();
		user = new User();
		user.setUserName(request.getParameter("userName"));
		user.setUserPass(request.getParameter("userPass"));
		userDBUtil.insertUser(user);
		return "success";
	}
	
	public String toString() {
		String s = this.getUserId() + this.getUserName() + this.getUserId();
		return s;
	}

	public int getUserId() {
		return userId;
	}

	public void setUserId(int userId) {
		this.userId = userId;
	}

	public String getUserName() {
		return userName;
	}

	public void setUserName(String userName) {
		this.userName = userName;
	}

	public String getUserPass() {
		return userPass;
	}

	public void setUserPass(String userPass) {
		this.userPass = userPass;
	}

	public int getUserType() {
		return userType;
	}

	public void setUserType(int userType) {
		this.userType = userType;
	}

	public int getUserFans() {
		return userFans;
	}

	public void setUserFans(int userFans) {
		this.userFans = userFans;
	}

	public int getUserFocus() {
		return userFocus;
	}

	public void setUserFocus(int userFocus) {
		this.userFocus = userFocus;
	}

	public String getUserPhoto() {
		return userPhoto;
	}

	public void setUserPhoto(String userPhoto) {
		this.userPhoto = userPhoto;
	}

	public int getUserRank() {
		return userRank;
	}

	public void setUserRank(int userRank) {
		this.userRank = userRank;
	}

	public User getUser() {
		return user;
	}

	public void setUser(User user) {
		this.user = user;
	}
	
	public List getUserList() {
		return userList;
	}

	public void setUserList(List userList) {
		this.userList = userList;
	}
	
}

