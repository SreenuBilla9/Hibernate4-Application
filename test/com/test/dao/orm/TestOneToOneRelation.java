package com.test.dao.orm;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Test;

import com.banking.retail.dao.AdminUserDAO;
import com.banking.retail.dao.dto.AdminUserDTO;
import com.banking.retail.dao.ex.DatabaseException;
import com.banking.retail.dao.hibernate.HibernateUserDAO;

public class TestOneToOneRelation {
	private static AdminUserDAO dao = null;

	@BeforeClass
	public static void beforeClass() {
		dao = new HibernateUserDAO();
	}

	@Test
	public void saveUserAndUserDetails() {
		AdminUserDTO dto = new AdminUserDTO();
		dto.setUsername("Test1235");
		dto.setFirstName("Alice");
		dto.setLastName("Test");
		dto.setDateofbirth(new Date());
		dto.setGender("M");
		dto.setIsEnabled("Y");
		dto.setIsLocked("N");
		dto.setCreatedate(new Date());
		dto.setUpdateddate(new Date());
		try {
			dao.insertAdminUser(dto);
		} catch (DatabaseException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}

	}

	@AfterClass
	public static void afterClass() {
		dao = null;
	}
}
