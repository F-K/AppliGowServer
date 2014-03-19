package service.user;

import java.io.IOException;

import model.user.User;
import model.user.UserDAO;
import service.Service;

public class EditUserService extends Service {

	@Override
	public void run() throws IOException, ClassNotFoundException {
		// Retrieve the user from the client
		User user = getProtocol().getUser();
		User userDAO = UserDAO.getUser(user.getLogin(), user.getPassword());
		
		if(userDAO == null) {
			getProtocol().sendUserExist(false);
			System.out.println("Invalid user password");
			return;
		}
		userDAO.setFirstName(user.getFirstName());
		userDAO.setLastName(user.getLastName());
		userDAO.setMail(user.getMail());
		
		// User exists
		UserDAO.updateUser(userDAO);
		getProtocol().sendUserExist(true);
		System.out.println(userDAO.getLogin() + " is updated");
	}

}
