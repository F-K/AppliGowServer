package model.event;

import java.util.List;

import model.DAO;

import org.hibernate.Query;
import org.hibernate.Session;
import org.hibernate.Transaction;

public class EventDAO extends DAO {
	
	public EventDAO(Session session, Transaction transaction) {
		super(session, transaction);
	}

	public static Event getEvent(int idEvent) {
		transaction = session.beginTransaction();
		String sql = "from Event where id = '" + idEvent + "'";
		Query q = session.createQuery(sql);
		List<Event> list = q.list();
		if(list.isEmpty())
			return null;
		return list.get(0);
	}
	
	public static Event createEvent(Event event) {
		transaction = session.beginTransaction();
		session.save(event);
		transaction.commit();
		return event;
	}
	
	public static void updateEvent(Event event) {
		transaction = session.beginTransaction();
		session.update(event);
		transaction.commit();
	}
	
	public static void deleteEvent(Event event) {
		transaction = session.beginTransaction();
		session.delete(event);
		transaction.commit();
	}
	
	public static Participant addParticipant(Participant participant) {
		transaction = session.beginTransaction();
		session.save(participant);
		transaction.commit();
		return participant;
	}

}
