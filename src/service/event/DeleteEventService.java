package service.event;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.event.EventDAO;
import service.Service;

public class DeleteEventService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		Event eventClient = getProtocol().getEvent();
		Event event = EventDAO.getEvent(eventClient.getId());
		EventDAO.deleteEvent(event);
		
		// Send MAJ events to the client
		List<Event> allEvents = EventDAO.getAllEvents();
		List<Event> events = EventDAO.getEvents(event.getUser().getId());
		getProtocol().sendEvents(allEvents);
		getProtocol().sendEvents(events);
		
		System.out.println(event.getTitle() + " is deleted successfully");
	}

}
