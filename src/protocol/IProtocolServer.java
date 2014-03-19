package protocol;

import java.io.IOException;
import java.util.List;

import model.event.Event;
import model.user.User;

public interface IProtocolServer {
	
	public String getService() throws IOException, ClassNotFoundException;
	public String getLogin() throws IOException, ClassNotFoundException;
	public String getPassword() throws IOException, ClassNotFoundException;
	public void sendUserExist(boolean exist) throws IOException;
	public void sendUser(User user) throws IOException;
	public User getUser() throws ClassNotFoundException, IOException;
	public Event getEvent() throws ClassNotFoundException, IOException;
	public void sendEvents(List<Event> events) throws IOException;
	public void sendEvent(Event event) throws IOException;

}
