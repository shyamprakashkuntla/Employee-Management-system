package com.nit.service;

import java.util.Optional;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

import com.nit.entity.MyUser;
import com.nit.repository.MyUserRepository;

@Service
public class MyUserService implements UserDetailsService{

	@Autowired
	private MyUserRepository myUserRepository;
	
	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Optional<MyUser> myUser = myUserRepository.findByEmail(username);
		if (myUser.isPresent()) return myUser.get();
		throw new UsernameNotFoundException("No User found on this Name");
	}

}
