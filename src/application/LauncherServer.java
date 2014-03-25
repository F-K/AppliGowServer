package application;

import hibernate.HibernateUtil;

import java.io.IOException;

import model.DAO;
import model.event.EventDAO;
import model.user.UserDAO;

import org.hibernate.Session;
import org.hibernate.Transaction;

import server.Server;

/**
 * Class that must be called to launch the server.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class LauncherServer {

	/**
	 * The main class that launch the server.
	 * 
	 * @param args
	 *            The arguments
	 */
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
