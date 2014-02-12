package service;

import java.io.IOException;

import protocole.IProtocoleServer;

public interface IService {
	
	public void setProtocole(IProtocoleServer protocole);
	public void run() throws IOException, ClassNotFoundException;

}
