package model;

import org.hibernate.Session;
import org.hibernate.Transaction;

public abstract class DAO {
	
	protected static Session session;
	protected static Transaction transaction;
	
	public DAO(Session session, Transaction transaction) {
		DAO.session = session;
		DAO.transaction = transaction;
	}

}
