package service;

import service.user.SignInService;
import service.user.SignUpService;

public class ServiceManager {

	public static IService getService(String service) {
		switch(NameService.valueOf(service)) {
			case SIGN_IN:
				return new SignInService();
			case SIGN_UP:
				return new SignUpService();
			default :
				return null;
		}
	}

}
