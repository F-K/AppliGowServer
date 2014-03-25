package model.event;

import java.util.List;

import model.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

/**
 * The DAO class for the event table, which extends the DAO class.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class EventDAO extends DAO {

	/**
	 * Constructor of the EventDAO class.
	 * 
	 * @param session
	 *            The session object.
	 * @param transaction
	 *            The transaction object.
	 */
	public EventDAO(Session session, Transaction transaction) {
		super(session, transaction);
	}

	/**
	 * Get an event from its id.
	 * 
	 * @param idEvent
	 *            The event's id.
	 * @return Event The event.
	 */
	public static Event getEvent(int idEvent) {
		// begin the transaction
		transaction = session.beginTransaction();

		// instanciate the query
		String sql = "from Event where id = '" + idEvent + "'";

		// get the event
		Query q = session.createQuery(sql);
		List<Event> list = q.list();

		// if no event is found, return an empty object
		if (list.isEmpty())
			return null;

		// if an event is found, return the event
		return list.get(0);
	}

	/**
	 * Create an event.
	 * 
	 * @param event
	 *            The event.
	 * @return Event The newly created event.
	 */
	public static Event createEvent(Event event) {
		transaction = session.beginTransaction();
		session.save(event);
		transaction.commit();
		return event;
	}

	/**
	 * Update an event.
	 * 
	 * @param event
	 *            The event to be updated.
	 */
	public static void updateEvent(Event event) {
		transaction = session.beginTransaction();
		session.update(event);
		transaction.commit();
	}

	/**
	 * Delete an event.
	 * 
	 * @param event
	 *            The event to be deleted.
	 */
	public static void deleteEvent(Event event) {
		transaction = session.beginTransaction();
		session.delete(event);
		transaction.commit();
	}

	/**
	 * Get a list of events of a user from the user's id.
	 * 
	 * @param idUser
	 *            The user id.
	 * @return List<Event> The event list of the user.
	 */
	public static List<Event> getEvents(int idUser) {
		transaction = session.beginTransaction();
		String sql = "from Event where idUser = '" + idUser + "'";
		Query q = session.createQuery(sql);
		List<Event> list = q.list();
		return list;
	}

	/**
	 * Get all the events.
	 * 
	 * @return List<Event> The event list.
	 */
	public static List<Event> getAllEvents() {
		transaction = session.beginTransaction();
		String sql = "from Event";
		Query q = session.createQuery(sql);
		List<Event> list = q.list();
		return list;
	}

	/**
	 * Delete all the events of a user from the user's id.
	 * 
	 * @param idUser
	 *            The user id.
	 */
	public static void deleteUserEvents(int idUser) {
		List<Event> events = getEvents(idUser);
		for (Event event : events)
			deleteEvent(event);
	}

}
