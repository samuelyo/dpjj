package main.java.com.core.register.service.impl;

import javax.annotation.Resource;

import org.springframework.stereotype.Service;

import main.java.com.core.model.EnterpriseUser;
import main.java.com.core.model.GeneralUser;
import main.java.com.core.register.service.IRegistService;
import main.java.com.core.webUtil.UniqueIdGenerator;

@Service
public class RegistServiceImpl implements IRegistService {


	private String getUniqueId(){
		String id = UniqueIdGenerator.getInstant().getUniqueId();
		return id;
	}

	@Override
	public EnterpriseUser insertEnterpriseUser(EnterpriseUser user) {
		// TODO Auto-generated method stub
		user.setEntrepriseUserId(getUniqueId());
		return user;
	}

	@Override
	public GeneralUser insertGeneralUser(GeneralUser user) {
		// TODO Auto-generated method stub
		user.setUserId(getUniqueId());
		return user;
	}

}
