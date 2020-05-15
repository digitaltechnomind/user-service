package com.trng.assignment1.user.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trng.assignment1.user.data.UserEntity;
import com.trng.assignment1.user.repo.UsersRepository;

@Service
public class UserServiceImpl implements UserService{
	
	@Autowired
	UsersRepository user_repo;
	
	@Override
	public UserEntity getUserById(Long id) {
	
		
		Optional<UserEntity> user=user_repo.findById(id);
		
		return user.isPresent()?user.get():null;
	}

}
