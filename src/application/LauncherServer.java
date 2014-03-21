package application;

import hibernate.HibernateUtil;

import java.io.IOException;

import model.DAO;
import model.event.EventDAO;
import model.user.UserDAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import server.Server;

public class LauncherServer {

	public static void main(String[] args) {
		try {
			// Launch Hibernate
			Session session = HibernateUtil.getSession();
			Transaction transaction = session.beginTransaction();
			DAO userDAO = new UserDAO(session, transaction);
			DAO eventDAO = new EventDAO(session, transaction);

			// Launch Server
			final int PORT = 1234;
			Server server = new Server(PORT);
			server.run();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

}
