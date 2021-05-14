package business.concretes;


import business.abstracts.UserCheckService;

import business.abstracts.UserService;
import business.abstracts.UserValidityService;
import core.abstracts.LoggerService;
import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class UserManager implements UserService {

	private UserCheckService userCheckService;
	private UserDao userDao;
	private LoggerService loggerService;
	
	
	public UserManager(UserCheckService userCheckService, UserDao userDao, LoggerService loggerService) {
		super();
		this.userCheckService = userCheckService;
		this.userDao = userDao;
		this.loggerService = loggerService;
	}

	
	@Override
	public void userRegister(User user) {
		UserValidityService validityService = new UserValidityManager(userDao);
		
		if
		(
		userCheckService.nameController(user.getFirstName(), user.getLastName())
		&&
		userCheckService.passwordController(user.getPassword())
		&&
		userCheckService.mailController(user.getMail())
		&&
		validityService.isItUsed(user.getMail())
		)
		{
			userDao.add(user);
			loggerService.register();
		}
		
	}

	@Override
	public void signIn(String mail, String password) {
		for(User user : userDao.getAll()) {
			if(mail.equals(user.getMail()) && password.equals(user.getPassword())) {
				System.out.println("Successfully logged in.");
			}else {
				System.out.println("One or more of your login information is incorrect.");
			}
		}
		
	}

}