package application;

import java.io.IOException;

import server.Server;

public class LauncherServer {

	public static void main(String[] args) {
		try {
			final int PORT = 1234;
			Server server = new Server(PORT);
			server.run();
		} catch (IOException e) {
			System.err.println(e.getMessage());
		} catch (ClassNotFoundException e) {
			System.err.println(e.getMessage());
		}
	}

}
