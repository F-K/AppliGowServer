package service;

import protocol.IProtocolServer;

/**
 * Abstract service class that implements the Service interface. This class is
 * used to set and get a server protocol.
 * 
 * @author Tiago DOS SANTOS, François KIM, Philippe PUONG, Axel SAINTILLAN
 * 
 */
public abstract class Service implements IService {

	private IProtocolServer protocol;

	public IProtocolServer getProtocol() {
		return protocol;
	}

	public void setProtocol(IProtocolServer protocol) {
		this.protocol = protocol;
	}

}
