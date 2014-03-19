package protocol;

import java.io.IOException;
import java.util.List;

import library.ITransport;
import model.event.Event;
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

	@Override
	public User getUser() throws ClassNotFoundException, IOException {
		return (User) transport.receive();
	}
	
	@Override
	public Event getEvent() throws ClassNotFoundException, IOException {
		return (Event) transport.receive();
	}

	@Override
	public void sendEvents(List<Event> events) throws IOException {
		transport.send(events);
	}

	@Override
	public void sendEvent(Event event) throws IOException {
		transport.send(event);
	}
	
}
