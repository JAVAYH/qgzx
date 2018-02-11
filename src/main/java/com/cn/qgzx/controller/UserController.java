package com.cn.qgzx.controller;

import java.util.List;

import javax.servlet.http.HttpServletRequest;

import org.apache.log4j.Logger;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.ModelMap;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.ResponseBody;

import com.cn.qgzx.entity.AcctUser;
import com.cn.qgzx.service.UserService;

/**
 * @author yanghong
 * @Date 2017年7月11日下午2:23:16
 * @Description 
 *
 */
@Controller
@RequestMapping("/user")
public class UserController {
	
	private static final Logger LOGGER=Logger.getLogger(UserController.class);
	
	@Autowired
	private UserService userService;
	
	@RequestMapping("/index")
	public String index(ModelMap modelMap,HttpServletRequest request){
		System.out.println("------------------");
		return "/index";
	}
	
	@RequestMapping("/showInfo")
	public String showUserInfo(ModelMap modelMap,HttpServletRequest request){
		String userId=request.getParameter("userId");
		//AcctUser userInfo=userService.load(userId);
		modelMap.addAttribute("nickName","success......");
		return "/user/showInfo";
	}
	
	@RequestMapping("/showInfos")
	public @ResponseBody List<AcctUser> showUserInfos(){
		List<AcctUser> userInfos=userService.findAll();
		return userInfos;
	}
	
	@RequestMapping("/testTag")
	public String testTag(){
		return "/user/dateConvert";
	}

}
