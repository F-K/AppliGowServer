package service.user;

import java.io.IOException;

import protocole.IProtocoleServer;
import service.IService;

public class SignInService implements IService {
	
	private IProtocoleServer protocole;

	public void setProtocole(IProtocoleServer protocole) {
		this.protocole = protocole;
	}

	@Override
	public void run() throws IOException, ClassNotFoundException {
		String login = protocole.getLogin();
		String password = protocole.getPassword();
		protocole.sendConnectionStatus(true);
		System.out.println(login + " + " + password); //Affiche temporaire
	}

}
