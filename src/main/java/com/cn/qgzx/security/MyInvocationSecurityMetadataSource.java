package com.cn.qgzx.security;

import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;

import org.springframework.security.access.ConfigAttribute;
import org.springframework.security.access.SecurityConfig;
import org.springframework.security.web.FilterInvocation;
import org.springframework.security.web.access.intercept.FilterInvocationSecurityMetadataSource;
import org.springframework.util.AntPathMatcher;
import org.springframework.util.PathMatcher;

public class MyInvocationSecurityMetadataSource implements FilterInvocationSecurityMetadataSource {
	
	private PathMatcher urlMatcher = new AntPathMatcher();
	private static Map<String,Collection<ConfigAttribute>> resourceMap = null;  
	
	public MyInvocationSecurityMetadataSource() {
		loadResourceDefine(); 
	}
	
	/**
	 * 容器启动执行方法，将资源、权限键值对加载到map当中
	 */
    private void loadResourceDefine() { 
        resourceMap = new HashMap<String, Collection<ConfigAttribute>>();  
        Collection<ConfigAttribute> atts = new ArrayList<ConfigAttribute>();  
        ConfigAttribute ca = new SecurityConfig("ROLE_ADMIN");  
        atts.add(ca);  
        resourceMap.put("/403.jsp", atts);  
    }  
	
	@Override
	public Collection<ConfigAttribute> getAttributes(Object object) throws IllegalArgumentException {
		String url = ((FilterInvocation)object).getRequestUrl(); 
		Iterator<String> ite = resourceMap.keySet().iterator();  
        while (ite.hasNext()) {  
            String resURL = ite.next();  
           if (urlMatcher.matchStart(url, resURL)) {  
               return resourceMap.get(resURL);  
            }  
        }  
		return null;
	}

	@Override
	public Collection<ConfigAttribute> getAllConfigAttributes() {
		return null;
	}

	@Override
	public boolean supports(Class<?> clazz) {
		return true;
	}

}
