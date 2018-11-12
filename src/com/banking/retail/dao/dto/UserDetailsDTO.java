package com.banking.retail.dao.dto;

import java.io.Serializable;
import java.util.Date;

public class UserDetailsDTO implements Serializable {

	private String username;
	private String userpwd;
	private String userrole;
	private String usertype;

	private String theme;
	private String userlang;
	private String email;
	private String mobile;

	private Date updatedDate;

	private AdminUserDTO userDTO;

	public AdminUserDTO getUserDTO() {
		return userDTO;
	}

	public void setUserDTO(AdminUserDTO userDTO) {
		this.userDTO = userDTO;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getUserpwd() {
		return userpwd;
	}

	public void setUserpwd(String userpwd) {
		this.userpwd = userpwd;
	}

	public String getUserrole() {
		return userrole;
	}

	public void setUserrole(String userrole) {
		this.userrole = userrole;
	}

	public String getUsertype() {
		return usertype;
	}

	public void setUsertype(String usertype) {
		this.usertype = usertype;
	}

	public String getTheme() {
		return theme;
	}

	public void setTheme(String theme) {
		this.theme = theme;
	}

	public String getUserlang() {
		return userlang;
	}

	public void setUserlang(String userlang) {
		this.userlang = userlang;
	}

	public String getEmail() {
		return email;
	}

	public void setEmail(String email) {
		this.email = email;
	}

	public String getMobile() {
		return mobile;
	}

	public void setMobile(String mobile) {
		this.mobile = mobile;
	}

	public Date getUpdatedDate() {
		return updatedDate;
	}

	public void setUpdatedDate(Date updatedDate) {
		this.updatedDate = updatedDate;
	}

}
