package model.user;

import java.util.List;

import model.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * The DAO class for the user table, that extends the DAO class.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class UserDAO extends DAO {

	/**
	 * Constructor for the UserDAO class.
	 * 
	 * @param session
	 *            The session.
	 * @param transaction
	 *            The transaction.
	 */
	public UserDAO(Session session, Transaction transaction) {
		super(session, transaction);
	}

	/**
	 * Create a new user.
	 * 
	 * @param login
	 *            The user login.
	 * @param password
	 *            The user password.
	 * @return User The newly created user.
	 */
	public static User createUser(String login, String password) {
		// create a new user
		User user = new User();

		// set the user informations
		user.setLogin(login);
		user.setPassword(password);
		user.setStatut(true);

		// execute the transaction
		transaction = session.beginTransaction();
		session.save(user);
		transaction.commit();

		// return the new user
		return user;
	}

	/**
	 * Get a user from his login.
	 * 
	 * @param login
	 *            The user login.
	 * @return User The user.
	 */
	public static User getUser(String login) {
		// begin the transaction
		transaction = session.beginTransaction();

		// instanciate the query
		String sql = "from User where login = '" + login + "'";

		// get the user
		Query q = session.createQuery(sql);
		List<User> list = q.list();

		// if no user is found, return a null object
		if (list.isEmpty())
			return null;

		// if a user is found, return the user
		return list.get(0);
	}

	/**
	 * Get a user with its login and password.
	 * 
	 * @param login
	 *            The login.
	 * @param password
	 *            The password.
	 * @return User The user.
	 */
	public static User getUser(String login, String password) {
		// begin the transaction
		transaction = session.beginTransaction();

		// instanciate the query
		String sql = "from User where login = '" + login + "' and password = '"
				+ password + "'";
		Query q = session.createQuery(sql);
		List<User> list = q.list();

		// if no user is found, return a null object
		if (list.isEmpty())
			return null;

		// if a user if found, return the user
		return list.get(0);
	}

	/**
	 * Update the user.
	 * 
	 * @param user
	 *            The user to be updated.
	 */
	public static void updateUser(User user) {
		transaction = session.beginTransaction();
		session.update(user);
		transaction.commit();
	}

	/**
	 * Delete a user.
	 * 
	 * @param user
	 *            The user to be deleted.
	 */
	public static void deleteUser(User user) {
		transaction = session.beginTransaction();
		session.delete(user);
		transaction.commit();
	}

}
