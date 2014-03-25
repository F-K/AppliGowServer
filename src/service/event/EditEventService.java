package service.event;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.event.EventDAO;

import service.Service;

/**
 * EditEventService class extends the Service class, and is used to edit an
 * event.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class EditEventService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		// retrieve the event
		Event eventClient = getProtocol().getEvent();
		Event event = EventDAO.getEvent(eventClient.getId());

		// edit the event data
		event.setTitle(eventClient.getTitle());
		event.setCategory(eventClient.getCategory());
		event.setDateStart(eventClient.getDateStart());
		event.setDateEnd(eventClient.getDateEnd());
		event.setDescription(eventClient.getDescription());

		// update the event
		EventDAO.updateEvent(event);

		// Send MAJ events to the client
		List<Event> allEvents = EventDAO.getAllEvents();
		List<Event> events = EventDAO
				.getEvents(getProtocol().getUser().getId());
		getProtocol().sendEvents(allEvents);
		getProtocol().sendEvents(events);

		System.out.println(event.getTitle() + " is updated");
	}

}
