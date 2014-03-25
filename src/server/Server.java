package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import library.ITransport;
import library.Transport;
import protocol.IProtocolServer;
import protocol.ProtocolServer;
import service.IService;
import service.ServiceFactory;

/**
 * The main server class, that initialize the socket.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class Server {

	/**
	 * The only server socket.
	 */
	private final ServerSocket serverSocket;

	/**
	 * Constructor of the server class.
	 * 
	 * @param port
	 *            The server port number.
	 * @throws IOException
	 */
	public Server(int port) throws IOException {
		// create a new socket
		this.serverSocket = new ServerSocket(port);
	}

	/**
	 * Method called to run the server.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void run() throws IOException, ClassNotFoundException {
		System.out.println("Server launched");

		Socket socket;
		ITransport transport;
		IProtocolServer protocol;
		while (true) {
			// Listens client's socket
			socket = this.serverSocket.accept();

			// Client's socket is accepted
			transport = new Transport(socket);
			protocol = new ProtocolServer(transport);

			// Retrieve the service's name
			String serviceName = protocol.getService();
			System.out.println("SERVICE CALLED : " + serviceName);

			// Create the service
			IService service = ServiceFactory.getService(serviceName);
			service.setProtocol(protocol);

			// Runs the service
			service.run();
		}
	}

}
