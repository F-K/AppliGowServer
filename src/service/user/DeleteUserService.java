package service.user;

import java.io.IOException;

import model.event.EventDAO;
import model.user.User;
import model.user.UserDAO;
import service.Service;

/**
 * DeleteUserService class extends the Service class, and is used to delete a
 * user from the database.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class DeleteUserService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		User userClient = getProtocol().getUser();
		User user = UserDAO.getUser(userClient.getLogin());

		// Delete user's events
		EventDAO.deleteUserEvents(user.getId());

		// Delete user
		UserDAO.deleteUser(user);

		System.out.println(user.getLogin() + " is deleted successfully");
	}

}
