package service;

import java.io.IOException;

import protocol.IProtocolServer;

public interface IService {
	
	public IProtocolServer getProtocol();
	public void setProtocol(IProtocolServer protocol);
	public void run() throws IOException, ClassNotFoundException;

}
