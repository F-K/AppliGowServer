package protocol;

import java.io.IOException;
import java.util.List;

import library.ITransport;
import model.event.Event;
import model.user.User;

/**
 * The server protocol class that implements the protocol server interface.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public class ProtocolServer implements IProtocolServer {

	/**
	 * The implemented transport class.
	 */
	private ITransport transport;

	/**
	 * Constructor of the protocol server class.
	 * 
	 * @param transport
	 *            The implemented transport class.
	 */
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
