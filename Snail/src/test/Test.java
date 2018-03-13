package test;

import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;

import org.hibernate.Session;
import org.hibernate.SessionFactory;
import org.hibernate.Transaction;
import org.hibernate.cfg.Configuration;

import com.snail.DBUtil.userDBUtil;
import com.snail.action.User;

public class Test {

	public static void main(String[] args) {
		User user = new User();
		List<User> userList = new ArrayList<User>();
		user.setUserName("damon");
		user.setUserPass("1234");
		userDBUtil.insertUser(user);
//		List users = userDBUtil.getAllUser();
//		for(Iterator iter = users.iterator(); iter.hasNext();) {
//			User u = (User) iter.next();
//			System.out.println(u);
//		}
	}
}
