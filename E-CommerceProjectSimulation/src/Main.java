

import business.abstracts.UserService;
import business.concretes.UserCheckManager;
import business.concretes.UserManager;
import core.concretes.GoogleLoggerManagerAdapter;
import dataAcces.concretes.HibernateUserDao;
import entities.concretes.User;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		UserService userService = new UserManager(new UserCheckManager(), new HibernateUserDao(), new GoogleLoggerManagerAdapter());
		User user = new User(1,"Þevval","Acet","svvlacet1134@gmail.com","123456");
		userService.userRegister(user);
	}

}