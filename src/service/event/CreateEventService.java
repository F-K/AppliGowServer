package service.event;

import java.io.IOException;

import model.event.Event;
import model.event.EventDAO;

import service.Service;

public class CreateEventService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		Event event = getProtocol().getEvent();
		EventDAO.createEvent(event);
		System.out.println(event.getTitle() + " is created successfully");
	}

}
