package com.trng.assignment1.user.repo;

import java.util.Optional;

import org.springframework.data.repository.CrudRepository;

import com.trng.assignment1.user.data.UserEntity;



public interface UsersRepository extends CrudRepository<UserEntity, Long> {
	
	Optional<UserEntity> findById(Long userId);
}
