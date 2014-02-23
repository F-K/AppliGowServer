package service.user;

import java.io.IOException;

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
		System.out.println(user.getLogin() + " + " + user.getPassword());
	}

}
