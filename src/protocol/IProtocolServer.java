package protocol;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.user.User;

/**
 * Interface for a server protocol class.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public interface IProtocolServer {

	/**
	 * Method called to get the service.
	 * 
	 * @return String The service's name.
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public String getService() throws IOException, ClassNotFoundException;

	/**
	 * Method called to get the login.
	 * 
	 * @return String The login.
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public String getLogin() throws IOException, ClassNotFoundException;

	/**
	 * Method called to get the password.
	 * 
	 * @return String The password.
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public String getPassword() throws IOException, ClassNotFoundException;

	/**
	 * Method to tell if the user exists or not.
	 * 
	 * @param exist
	 *            true if the user exists, false if not.
	 * @throws IOException
	 */
	public void sendUserExist(boolean exist) throws IOException;

	/**
	 * Method to send a User object.
	 * 
	 * @param user
	 *            The user to be sent.
	 * @throws IOException
	 */
	public void sendUser(User user) throws IOException;

	/**
	 * Method to get a user.
	 * 
	 * @return User The user.
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public User getUser() throws ClassNotFoundException, IOException;

	/**
	 * Method to get an event.
	 * 
	 * @return Event The event.
	 * @throws ClassNotFoundException
	 * @throws IOException
	 */
	public Event getEvent() throws ClassNotFoundException, IOException;

	/**
	 * Method to send a list of events.
	 * 
	 * @param events
	 *            The list of events.
	 * @throws IOException
	 */
	public void sendEvents(List<Event> events) throws IOException;

	/**
	 * Method to send a single event.
	 * 
	 * @param event
	 *            The event.
	 * @throws IOException
	 */
	public void sendEvent(Event event) throws IOException;

}
