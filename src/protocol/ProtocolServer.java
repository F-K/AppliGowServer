package protocol;

import java.io.IOException;

import library.ITransport;
import model.user.User;

public class ProtocolServer implements IProtocolServer {

	private ITransport transport;
	
	public ProtocolServer(ITransport transport) {
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
	public void sendUser(User user) throws IOException {
		transport.send(user);
	}

	@Override
	public void sendUserExist(boolean exist) throws IOException {
		transport.send(exist);
	}
	
}
