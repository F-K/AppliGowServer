package server;

import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;

import protocole.IProtocoleServer;
import protocole.ProtocoleServer;

import service.IService;
import service.ServiceManager;
import library.ITransport;
import library.Transport;

public class Server {

	private final ServerSocket serverSocket;
	
	public Server(int port) throws IOException {
		this.serverSocket = new ServerSocket(port);
	}
	
	public void run() throws IOException, ClassNotFoundException {
		System.out.println("Server launched");
		Socket socket;
		ITransport transport;
		IProtocoleServer protocole;
		while(true) {
			socket = this.serverSocket.accept();
			transport = new Transport(socket);
			protocole = new ProtocoleServer(transport);
			String service = protocole.getService();
			System.out.println("SERVICE : " + service); //Affichage temporaire du nom du service
			IService serviceProcess = ServiceManager.getService(service);
			serviceProcess.setProtocole(protocole);
			serviceProcess.run();
		}
	}

}
