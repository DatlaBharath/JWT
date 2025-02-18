package com.iiht.jwt;
import java.util.ArrayList;

import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;
import org.springframework.stereotype.Service;

@Service
public class MyUserDetailsService implements UserDetailsService {
	@Override

	public UserDetails loadUserByUsername(String userName) throws UsernameNotFoundException {
	System.out.println(userName);
//       an empty list of authorities
	return new org.springframework.security.core.userdetails.User("foo","foo",new ArrayList<>());
	}
}