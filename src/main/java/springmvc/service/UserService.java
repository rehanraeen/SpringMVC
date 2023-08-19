package springmvc.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import springmvc.bean.User;
import springmvc.dao.UserDao;

@Service
public class UserService {
	
	@Autowired
	private UserDao userDao;
	
	public int crateUser(User user) {
		return this.userDao.saveUser(user);
	}

}
