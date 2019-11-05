package com.test.dao.user;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.banking.retail.dao.AdminUserDAO;
import com.banking.retail.dao.dto.AdminUserDTO;
import com.banking.retail.dao.ex.DatabaseException;
import com.banking.retail.dao.hibernate.HibernateUserDAO;

public class TestUserDAO {

	private static AdminUserDAO dao = null;

	@BeforeClass
	public static void beforeClass() {
		dao = new HibernateUserDAO();
	}

	@Test
	public void save() {
		AdminUserDTO dto = new AdminUserDTO();
		try {
			dto.setUsername("Test123");
			dto.setFirstName("Alice");
			dto.setLastName("Test");
			dto.setDateofbirth(new Date());
			dto.setGender("M");
			dto.setIsEnabled("Y");
			dto.setIsLocked("N");
			dto.setCreatedate(new Date());
			dto.setUpdateddate(new Date());

			dao.insertAdminUser(dto);
		} catch (DatabaseException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	public void get() {
		try {
			AdminUserDTO dto = dao.getUserByUsername("Test1234");
			System.out.println(dto);
		} catch (DatabaseException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	@Ignore
	public void load() {
		try {
			AdminUserDTO dto = dao.loadUserByUsername("Test1234");
			System.out.println(dto);
		} catch (DatabaseException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@AfterClass
	public static void afterClass() {
		//after completing task
		dao = null;
		
	}
}
