package com.cn.qgzx.entity.app;

import javax.persistence.Entity;
import javax.persistence.Table;

import com.cn.qgzx.entity.BasicEntity;
/**
 * 
 * @author yanghong
 * @date 2018年2月10日 下午4:32:17
 * @description
 */
@Entity
@Table(name = "T_APP_ROLE")
public class RoleEntity extends BasicEntity{
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	private String roleName; //角色名称
	public String getRoleName() {
		return roleName;
	}
	public void setRoleName(String roleName) {
		this.roleName = roleName;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	private String enable; //是否可用
}
