package model.user;

import java.util.List;

import model.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class UserDAO extends DAO {
	
	public UserDAO(Session session, Transaction transaction) {
		super(session, transaction);
	}
	
	public static User createUser(String login, String password) {
		User user = new User();
		user.setLogin(login);
		user.setPassword(password);
		user.setStatut(true);
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();
		return user;
	}
	
	public static User getUser(String login) {
		transaction = session.beginTransaction();
		String sql = "from User where login = '" + login + "'";
		Query q = session.createQuery(sql);
		List<User> list = q.list();
		if(list.isEmpty())
			return null;
		return list.get(0);
	}

	public static User getUser(String login, String password) {
		transaction = session.beginTransaction();
		String sql = "from User where login = '" + login + "' and password = '" + password + "'";
		Query q = session.createQuery(sql);
		List<User> list = q.list();
		if(list.isEmpty())
			return null;
		return list.get(0);
	}
	
	public static void updateUser(User user) {
		transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
	}

}
