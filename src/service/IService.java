package service;

import java.io.IOException;

import protocol.IProtocolServer;

/**
 * Service interface class.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public interface IService {

	/**
	 * Get the server protocol.
	 * 
	 * @return IProtocolServer The protocol.
	 */
	public IProtocolServer getProtocol();

	/**
	 * Set the server protocol.
	 * 
	 * @param protocol
	 *            The protocol.
	 */
	public void setProtocol(IProtocolServer protocol);

	/**
	 * Method used to run a service.
	 * 
	 * @throws IOException
	 * @throws ClassNotFoundException
	 */
	public void run() throws IOException, ClassNotFoundException;

}
