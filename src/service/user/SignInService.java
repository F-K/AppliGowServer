package service.user;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.event.EventDAO;
import model.user.User;
import model.user.UserDAO;
import service.Service;

public class SignInService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		// Retrieve the login and password from the client
		String login = getProtocol().getLogin();
		String password = getProtocol().getPassword();
		
		User user = UserDAO.getUser(login, password);
		
		// User doesn't exist
		if(user == null) {
			getProtocol().sendUserExist(false);
			System.out.println("User : doesn't exist");
			return;
		}
		
		// User exists
		getProtocol().sendUserExist(true);
		getProtocol().sendUser(user);
		
		// Send events
		List<Event> allEvents = EventDAO.getAllEvents();
		List<Event> events = EventDAO.getEvents(user.getId());
		getProtocol().sendEvents(allEvents);
		getProtocol().sendEvents(events);
		
		System.out.println(user.getLogin() + " + " + user.getPassword());
	}

}
