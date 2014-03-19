package service.event;

import java.io.IOException;

import model.event.Event;
import model.event.EventDAO;

import service.Service;

public class CreateEventService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		Event event = getProtocol().getEvent();
		Event eventDAO = EventDAO.createEvent(event);
		getProtocol().sendEvent(eventDAO);
		System.out.println(eventDAO.getTitle() + " is created successfully");
	}

}
