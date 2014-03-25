package service.event;

import java.io.IOException;

import model.event.Event;
import model.event.EventDAO;

import service.Service;

/**
 * CreateEventService class extends the Service class, to create an event in the
 * database.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class CreateEventService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		// get the event
		Event event = getProtocol().getEvent();

		// create the event
		Event eventDAO = EventDAO.createEvent(event);
		getProtocol().sendEvent(eventDAO);

		System.out.println(eventDAO.getTitle() + " is created successfully");
	}

}
