package service.event;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.event.EventDAO;

import service.Service;

public class EditEventService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		Event eventClient = getProtocol().getEvent();
		Event event = EventDAO.getEvent(eventClient.getId());
		
		event.setTitle(eventClient.getTitle());
		event.setCategory(eventClient.getCategory());
		event.setDateStart(eventClient.getDateStart());
		event.setDateEnd(eventClient.getDateEnd());
		event.setDescription(eventClient.getDescription());
		EventDAO.updateEvent(event);
		
		// Send MAJ events to the client
		List<Event> allEvents = EventDAO.getAllEvents();
		List<Event> events = EventDAO.getEvents(getProtocol().getUser().getId());
		getProtocol().sendEvents(allEvents);
		getProtocol().sendEvents(events);
		
		System.out.println(event.getTitle() + " is updated");
	}

}
