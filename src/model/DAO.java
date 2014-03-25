package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * The abstract DAO class, with a session and a transaction object.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public abstract class DAO {

	/**
	 * The session object.
	 */
	protected static Session session;

	/**
	 * The transaction object.
	 */
	protected static Transaction transaction;

	/**
	 * Constructor of the DAO class.
	 * 
	 * @param session
	 *            The session.
	 * @param transaction
	 *            The transaction.
	 */
	public DAO(Session session, Transaction transaction) {
		DAO.session = session;
		DAO.transaction = transaction;
	}

}
