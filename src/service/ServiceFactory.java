package service;

import service.user.EditService;
import service.user.SignInService;
import service.user.SignUpService;

public class ServiceFactory {

	/**
	 * Returns an service from his name
	 * @param service The name of service
	 * @return An Service
	 */
	public static IService getService(String service) {
		switch(ServiceName.valueOf(service)) {
			case SIGN_IN:
				return new SignInService();
			case SIGN_UP:
				return new SignUpService();
			case EDIT_USER:
				return new EditService();
			default :
				return null;
		}
	}

}
