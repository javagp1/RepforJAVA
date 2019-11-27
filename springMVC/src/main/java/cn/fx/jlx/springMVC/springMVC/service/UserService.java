package cn.fx.jlx.springMVC.springMVC.service;

import java.util.List;
import java.util.UUID;

import org.apache.shiro.crypto.hash.Md5Hash;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import cn.fx.jlx.springMVC.springMVC.exception.LognameNotExistException;
import cn.fx.jlx.springMVC.springMVC.exception.PasswordErroException;
import cn.fx.jlx.springMVC.springMVC.exception.StatusException;
import cn.fx.jlx.springMVC.springMVC.mapper.StuserMapper;
import cn.fx.jlx.springMVC.springMVC.mapper.UserMapper;
import cn.fx.jlx.springMVC.springMVC.pojo.Stuser;
import cn.fx.jlx.springMVC.springMVC.pojo.User;
import cn.fx.jlx.springMVC.springMVC.pojo.UserExample;

@Service
public class UserService {

	@Autowired
	private UserMapper userMapper;
	
	@Autowired
	private StuserMapper stuserMapper;
	
	@Transactional
	public boolean stregister(Stuser stuser) {
		String salt = UUID.randomUUID().toString();
		stuser.setSpassword(new Md5Hash(stuser.getSpassword(), salt).toString());
		stuser.setSalt(salt);
		stuser.setStatus(1);
		

		
		return stuserMapper.insert(stuser) == 1;

	}

	public boolean register(User user) {
		String salt = UUID.randomUUID().toString();
		user.setPassword(new Md5Hash(user.getPassword(), salt).toString());
		user.setSalt(salt);
		user.setStatus(1);
		user.setUtid(1);

		UserExample example = new UserExample();
		example.createCriteria().andLognameEqualTo(user.getLogname());
		return userMapper.insert(user) == 1;

	}

	public boolean userNameAlreadyUsed(String logname) {

		UserExample example = new UserExample();
		example.createCriteria().andLognameEqualTo(logname);
		return userMapper.countByExample(example) == 1;

	}

	public User login(String logname, String password)
			throws LognameNotExistException, PasswordErroException, StatusException {

		UserExample example = new UserExample();
		example.createCriteria().andLognameEqualTo(logname);
		List<User> li = userMapper.selectByExample(example);
		

		

		if (li.size() == 0) {
			throw new LognameNotExistException();
		} else {
			User user = li.get(0);
			String passwordMd5 = new Md5Hash(password, user.getSalt()).toString();
			if (!passwordMd5.equals(user.getPassword())) {

				throw new PasswordErroException();

			} else if (user.getStatus() == 0) {
				throw new StatusException();
			} else {
				return user;
			}
		}

	}
}
