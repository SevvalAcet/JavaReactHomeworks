package dataAcces.concretes;

import java.util.ArrayList;
import java.util.List;

import dataAcces.abstracts.UserDao;
import entities.concretes.User;

public class HibernateUserDao implements UserDao{

	List<User> users = new ArrayList<User>();
	
	
	@Override
	public void add(User user) {
	
		System.out.println(user.getFirstName()+"isimli kullanýcý eklendi" );
	    users.add(user);
	}

	@Override
	public void update(User user) {
		System.out.println(user.getFirstName()+"isimli kullanýcý güncellendi" );

		
	}

	@Override
	public void delete(User user) {
		for(User _user : users) {
			if(_user.getId()==user.getId()) {
				users.remove(user);
			}
		} 
		
	}

	@Override
	public User get(int id) {
		for(User user : users) {
			if(user.getId()==id) {
				return user;
			}
		}
		return null;
	}

	@Override
	public List<User> getAll() {
		
		return null;
	}
    
}
