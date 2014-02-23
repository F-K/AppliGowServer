package service;

import protocol.IProtocolServer;

public abstract class Service implements IService {

	private IProtocolServer protocol;
	
	public IProtocolServer getProtocol() {
		return protocol;
	}

	public void setProtocol(IProtocolServer protocol) {
		this.protocol = protocol;
	}
	
}
