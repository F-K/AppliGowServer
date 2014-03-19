package application;

import hibernate.HibernateUtil;

import java.io.IOException;
import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;

import model.DAO;
import model.event.Event;
import model.event.EventDAO;
import model.event.Participant;
import model.user.User;
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
			
			//EventDAO.getAllEvents();

//			SimpleDateFormat sdf = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
//			sdf.setLenient(false);
//			Date dateStart = null, dateEnd = null;
//			String start = "2014-3-6 3:4:00", end = "2014-4-9 2:7:00";
//			try {
//				dateStart = sdf.parse(start);
//				dateEnd = sdf.parse(end);
//			} catch (ParseException e) {
//				e.printStackTrace();
//			}
//			
//			User user = UserDAO.getUser("saki", "dopu");
//			
//			Event event = new Event();
//			event.setUser(user);
//			event.setTitle("Buffet");
//			event.setAddress("90 rue de Tolbiac 75013 Paris");
//			event.setCategory("Restaurant");
//			event.setDescription("Manger à volonté");
//			event.setDateStart(dateStart);
//			event.setDateEnd(dateEnd);
//			EventDAO.createEvent(event);
			
//			User userParticipant = UserDAO.getUser("appli", "gow");
//			Participant participant = new Participant(event, userParticipant);
//			EventDAO.addParticipant(participant);
			
			//Event e = EventDAO.getEvent(1);
			//EventDAO.deleteEvent(e);

			// Launch Server
			final int PORT = 1234;
			Server server = new Server(PORT);
			server.run();
		} catch (IOException | ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

}
