package service.impl;

import dao.AdminAccountDao;
import dao.impl.AdminAccountImpl;
import po.AdminAccount;
import service.AdminAccountManager;

public class AdminAccountManagerImpl implements AdminAccountManager {
	private AdminAccountDao aad = new AdminAccountImpl();
	
	public void addAdminAccount(AdminAccount aa) {
		

	}

	public void updateAdminAccount(AdminAccount aa) {
		

	}

	public AdminAccount loadAdminAccount(String accName) {
		return aad.loadAdmin(accName);
	}

}
