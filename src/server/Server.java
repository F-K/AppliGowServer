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

public class Server {

	private final ServerSocket serverSocket;
	
	public Server(int port) throws IOException {
		this.serverSocket = new ServerSocket(port);
	}
	
	public void run() throws IOException, ClassNotFoundException {
		System.out.println("Server launched");
		Socket socket;
		ITransport transport;
		IProtocolServer protocol;
		while(true) {
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
