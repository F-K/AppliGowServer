package service.user;

import java.io.IOException;

import model.user.User;
import model.user.UserDAO;
import service.Service;

/**
 * EditUserService class extends the Service class, and is used to edit the user
 * informations.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class EditUserService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		// retrieve the user from the client
		User user = getProtocol().getUser();
		User userDAO = UserDAO.getUser(user.getLogin(), user.getPassword());

		// if the retrieved user is not null
		if (userDAO == null) {
			getProtocol().sendUserExist(false);
			System.out.println("Invalid user password");
			return;
		}

		// update the user informations
		userDAO.setFirstName(user.getFirstName());
		userDAO.setLastName(user.getLastName());
		userDAO.setMail(user.getMail());

		// User exists
		UserDAO.updateUser(userDAO);
		getProtocol().sendUserExist(true);
		System.out.println(userDAO.getLogin() + " is updated");
	}

}
