package com.grp6.reddit_clone.repository;

import org.springframework.data.jpa.repository.support.JpaRepositoryFactory;
import org.springframework.stereotype.Repository;

import com.grp6.reddit_clone.model.User;

import java.util.Optional;
import java.util.OptionalDouble;

import org.springframework.data.jpa.repository.JpaRepository;

@Repository
public interface UserRepository extends JpaRepository<User, Long>{
	Optional<User> findByUsername(String username);

}
