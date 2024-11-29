package com.drill.svc;

import java.util.function.Supplier;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.drill.domain.User;
import com.drill.domain.UserRoleStatus;
import com.drill.domain.repo.UserRepository;

import jakarta.transaction.Transactional;

@Service
public class UserService {

	@Autowired
	private UserRepository userRepository;

	@Transactional
	public void join(User user) {
		user.setRole(UserRoleStatus.USER);
		userRepository.save(user);
	}

	@Transactional
	public User getUser(String userid) {
		User findUser = userRepository.findByUserid(userid).orElseGet(
				new Supplier<User>() {
					public User get() {
						return new User();
					}
				});
		return findUser;
	}

}
