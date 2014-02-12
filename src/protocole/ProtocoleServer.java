package protocole;

import java.io.IOException;

import library.ITransport;

public class ProtocoleServer implements IProtocoleServer {

	private ITransport transport;
	
	public ProtocoleServer(ITransport transport) {
		this.transport = transport;
	}

	@Override
	public String getService() throws IOException, ClassNotFoundException {
		return (String) transport.receive();
	}
	
	@Override
	public String getLogin() throws IOException, ClassNotFoundException {
		return (String) transport.receive();
	}
	
	@Override
	public String getPassword() throws IOException, ClassNotFoundException {
		return (String) transport.receive();
	}

	@Override
	public void sendConnectionStatus(boolean status) throws IOException {
		transport.send(status);
	}

}
