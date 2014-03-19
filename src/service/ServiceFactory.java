package service;

import service.event.CreateEventService;
import service.user.EditUserService;
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
				return new EditUserService();
			case CREATE_EVENT:
				return new CreateEventService();
			default :
				return null;
		}
	}

}
