package com.cn.qgzx.security;

import java.util.Collection;
import java.util.Iterator;

import org.springframework.security.access.AccessDecisionManager;
import org.springframework.security.access.AccessDeniedException;
import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.authentication.InsufficientAuthenticationException;
import org.springframework.security.core.Authentication;
import org.springframework.security.core.GrantedAuthority;

public class MyAccessDecisionManager implements AccessDecisionManager{

	@Override
	public void decide(Authentication authentication, Object object, Collection<ConfigAttribute> configAttributes)
			throws AccessDeniedException, InsufficientAuthenticationException {
		if (configAttributes == null) {
			return ;
		}
		System.out.println(object.toString());
		Iterator<ConfigAttribute> it = configAttributes.iterator();
		while (it.hasNext()){
			ConfigAttribute c = it.next();
			String needRole = ((SecurityConfig)c).getAttribute();  
			for (GrantedAuthority g:authentication.getAuthorities()) {
				if (needRole.equals(g.getAuthority())) {
					return;
				}
			}
			throw new AccessDeniedException("no premission");
		}
	}

	@Override
	public boolean supports(ConfigAttribute attribute) {
		return false;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}
	
	

}
