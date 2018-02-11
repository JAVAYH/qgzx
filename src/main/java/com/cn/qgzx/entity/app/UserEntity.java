package com.cn.qgzx.entity.app;

import java.util.Date;

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
@Table(name = "T_APP_USER")
public class UserEntity extends BasicEntity{
	private String accName; //账户名
	private String userName; //用户姓名
	private String passWord; //用户密码
	private String email; //邮箱
	private String phone; //联系方式
	private Date dateTime; //最后一次登录时间
	private String departmentId; //部门ID
	private String departmentName; //部门名称
	private String enable; //是否可用
	private String expired; //是否过期
	private String locking; //是否锁定
	
	public String getAccName() {
		return accName;
	}
	public void setAccName(String accName) {
		this.accName = accName;
	}
	public String getUserName() {
		return userName;
	}
	public void setUserName(String userName) {
		this.userName = userName;
	}
	public String getPassWord() {
		return passWord;
	}
	public void setPassWord(String passWord) {
		this.passWord = passWord;
	}
	public String getEmail() {
		return email;
	}
	public void setEmail(String email) {
		this.email = email;
	}
	public String getPhone() {
		return phone;
	}
	public void setPhone(String phone) {
		this.phone = phone;
	}
	public Date getDateTime() {
		return dateTime;
	}
	public void setDateTime(Date dateTime) {
		this.dateTime = dateTime;
	}
	public String getDepartmentId() {
		return departmentId;
	}
	public void setDepartmentId(String departmentId) {
		this.departmentId = departmentId;
	}
	public String getDepartmentName() {
		return departmentName;
	}
	public void setDepartmentName(String departmentName) {
		this.departmentName = departmentName;
	}
	public String getEnable() {
		return enable;
	}
	public void setEnable(String enable) {
		this.enable = enable;
	}
	public String getExpired() {
		return expired;
	}
	public void setExpired(String expired) {
		this.expired = expired;
	}
	public String getLocking() {
		return locking;
	}
	public void setLocking(String locking) {
		this.locking = locking;
	}
}
