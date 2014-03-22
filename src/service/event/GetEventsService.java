package service.event;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.event.EventDAO;

import service.Service;

public class GetEventsService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		
		// Send MAJ events to the client
		List<Event> allEvents = EventDAO.getAllEvents();
		List<Event> events = EventDAO.getEvents(getProtocol().getUser().getId());
		getProtocol().sendEvents(allEvents);
		getProtocol().sendEvents(events);
	}

}
