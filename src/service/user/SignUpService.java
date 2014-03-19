package service.user;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.event.EventDAO;
import model.user.User;
import model.user.UserDAO;
import service.Service;

public class SignUpService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		// Retrieve the login and password from the client
		String login = getProtocol().getLogin();
		String password = getProtocol().getPassword();
		
		User user = UserDAO.getUser(login);

		// Login exists
		if(user != null) {
			getProtocol().sendUserExist(true);
			System.out.println("User : Login ("+login+") exists");
			return;
		}
		
		// Login & Password exist
		user = UserDAO.getUser(login, password);
		if(user != null) {
			getProtocol().sendUserExist(true);
			System.out.println("User : Login ("+login+") & Password ("+password+") exist");
			return;
		}
		getProtocol().sendUserExist(false);
		
		// User doesn't exists
		// User is created
		user = UserDAO.createUser(login, password);
		getProtocol().sendUser(user);
		
		// Send Events
		List<Event> allEvents = EventDAO.getAllEvents();
		getProtocol().sendEvents(allEvents);
		
		System.out.println(user.getLogin() + " + " + user.getPassword());
	}

}
