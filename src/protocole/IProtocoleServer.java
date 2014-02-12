package protocole;

import java.io.IOException;

public interface IProtocoleServer {
	
	public String getService() throws IOException, ClassNotFoundException;
	public String getLogin() throws IOException, ClassNotFoundException;
	public String getPassword() throws IOException, ClassNotFoundException;
	public void sendConnectionStatus(boolean status) throws IOException;

}
