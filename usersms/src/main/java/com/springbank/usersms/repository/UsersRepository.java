package com.springbank.usersms.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.springbank.usersms.entity.User;

@Repository
public interface UsersRepository extends JpaRepository<User, Integer>{
	
}
