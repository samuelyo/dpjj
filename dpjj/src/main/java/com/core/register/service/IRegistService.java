package main.java.com.core.register.service;

import main.java.com.core.model.EnterpriseUser;
import main.java.com.core.model.GeneralUser;

public interface IRegistService {
	
	public EnterpriseUser insertEnterpriseUser(EnterpriseUser user);
	public GeneralUser insertGeneralUser(GeneralUser user);
	
}
