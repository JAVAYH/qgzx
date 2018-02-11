package com.cn.qgzx.security;

import java.util.ArrayList;
import java.util.Collection;

import org.springframework.security.core.GrantedAuthority;
import org.springframework.security.core.authority.GrantedAuthorityImpl;
import org.springframework.security.core.userdetails.User;
import org.springframework.security.core.userdetails.UserDetails;
import org.springframework.security.core.userdetails.UserDetailsService;
import org.springframework.security.core.userdetails.UsernameNotFoundException;

public class MyUserDetailService implements UserDetailsService{

	@Override
	public UserDetails loadUserByUsername(String username) throws UsernameNotFoundException {
		Collection<GrantedAuthority> auths = new ArrayList<GrantedAuthority>();
		GrantedAuthorityImpl auth = new GrantedAuthorityImpl("ROLE_ADMIN");
		auths.add(auth);
		
		if (username.equals("admin")) {
			auths = new ArrayList<GrantedAuthority>();
            auths.add(new GrantedAuthorityImpl("ROLE_ROBIN")); 
		}
        User user = new User(username, "admin", true, true, true, true, auths); 
		return user;
	}

}
