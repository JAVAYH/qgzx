package com.cn.qgzx.entity.app;

import javax.persistence.Entity;
import javax.persistence.Table;
/**
 * 
 * @author yanghong
 * @date 2018年2月10日 下午4:57:48
 * @description
 */
@Entity
@Table(name = "T_APP_MENU")
public class MenuEntity {
	private String menuName; //菜单名称
	private String menuUrl; //菜单路径
	private String upMenu; //上级菜单
	private String type; //类型
	private String permission; //权限编码
	
	public String getMenuName() {
		return menuName;
	}
	public void setMenuName(String menuName) {
		this.menuName = menuName;
	}
	public String getMenuUrl() {
		return menuUrl;
	}
	public void setMenuUrl(String menuUrl) {
		this.menuUrl = menuUrl;
	}
	public String getUpMenu() {
		return upMenu;
	}
	public void setUpMenu(String upMenu) {
		this.upMenu = upMenu;
	}
	public String getType() {
		return type;
	}
	public void setType(String type) {
		this.type = type;
	}
	public String getPermission() {
		return permission;
	}
	public void setPermission(String permission) {
		this.permission = permission;
	}
	
	

}
