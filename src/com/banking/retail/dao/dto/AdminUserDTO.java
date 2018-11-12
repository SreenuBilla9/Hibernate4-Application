package com.banking.retail.dao.dto;

import java.io.Serializable;
import java.util.Date;
import java.util.Set;

public class AdminUserDTO implements Serializable {

	private String username;

	private String firstName;

	private String lastName;

	private Date dateofbirth;

	private String gender;

	private String isEnabled;

	private String isLocked;

	private Date createdate;

	private Date updateddate;

	private UserDetailsDTO userDetailsDTO;

	private Set<AccountDTO> accounts;

	public Set<AccountDTO> getAccounts() {
		return accounts;
	}

	public void setAccounts(Set<AccountDTO> accounts) {
		this.accounts = accounts;
	}

	public UserDetailsDTO getUserDetailsDTO() {
		return userDetailsDTO;
	}

	public void setUserDetailsDTO(UserDetailsDTO userDetailsDTO) {
		this.userDetailsDTO = userDetailsDTO;
	}

	public String getUsername() {
		return username;
	}

	public void setUsername(String username) {
		this.username = username;
	}

	public String getFirstName() {
		return firstName;
	}

	public void setFirstName(String firstName) {
		this.firstName = firstName;
	}

	public String getLastName() {
		return lastName;
	}

	public void setLastName(String lastName) {
		this.lastName = lastName;
	}

	public Date getDateofbirth() {
		return dateofbirth;
	}

	public void setDateofbirth(Date dateofbirth) {
		this.dateofbirth = dateofbirth;
	}

	public String getGender() {
		return gender;
	}

	public void setGender(String gender) {
		this.gender = gender;
	}

	public String getIsEnabled() {
		return isEnabled;
	}

	public void setIsEnabled(String isEnabled) {
		this.isEnabled = isEnabled;
	}

	public String getIsLocked() {
		return isLocked;
	}

	public void setIsLocked(String isLocked) {
		this.isLocked = isLocked;
	}

	public Date getCreatedate() {
		return createdate;
	}

	public void setCreatedate(Date createdate) {
		this.createdate = createdate;
	}

	public Date getUpdateddate() {
		return updateddate;
	}

	public void setUpdateddate(Date updateddate) {
		this.updateddate = updateddate;
	}

	@Override
	public String toString() {
		return "AdminUserDTO [username=" + username + ", firstName=" + firstName + ", lastName=" + lastName
				+ ", dateofbirth=" + dateofbirth + ", gender=" + gender + ", isEnabled=" + isEnabled + ", isLocked="
				+ isLocked + ", createdate=" + createdate + ", updateddate=" + updateddate + "]";
	}

}
