package service;

import java.util.List;

import po.MerchAccount;

public interface MerchAccountManager {
	public MerchAccount loadMerchAccount(int id);
	public void addMerchAccount(MerchAccount ma);
	public void updateMerchAccount(MerchAccount ma);
	public List<MerchAccount> listAllMerchAccounts();
}
