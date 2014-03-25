package service.event;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.event.EventDAO;
import service.Service;

/**
 * DeleteEventService class extends the Service class, and is used to delete an
 * event from the database.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class DeleteEventService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		// get the event to be deleted
		Event eventClient = getProtocol().getEvent();
		Event event = EventDAO.getEvent(eventClient.getId());

		// delete the event
		EventDAO.deleteEvent(event);

		// Send MAJ events to the client
		List<Event> allEvents = EventDAO.getAllEvents();
		List<Event> events = EventDAO.getEvents(event.getUser().getId());
		getProtocol().sendEvents(allEvents);
		getProtocol().sendEvents(events);

		System.out.println(event.getTitle() + " is deleted successfully");
	}

}
