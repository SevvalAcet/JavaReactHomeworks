package business.concretes;

import business.abstracts.UserValidityService;

import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class UserValidityManager implements UserValidityService {

	private UserDao userDao;
	
	public UserValidityManager(UserDao userDao) {
		super();
		this.userDao = userDao;
	}

	@Override
	public boolean isItUsed(String mail) {
		for(User user : userDao.getAll()) {
			if(mail.equals(user.getMail())) {
				System.out.println("This e-mail address has been used before. Please enter a different e-mail address.");
				return false;
			}
		}
		return true;
		
	}

}