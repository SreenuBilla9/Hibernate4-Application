package com.test.dao.account;

import java.util.Date;

import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;

import com.banking.retail.dao.AccountDAO;
import com.banking.retail.dao.dto.AccountDTO;
import com.banking.retail.dao.dto.AdminUserDTO;
import com.banking.retail.dao.ex.DatabaseException;
import com.banking.retail.dao.hibernate.HibernateAccountDAO;

public class TestAccountDAO {

	private static AccountDAO dao = null;

	@BeforeClass
	public static void beforeClass() {
		dao = new HibernateAccountDAO();
	}

	@Test
	public void save() {
		try {
			AccountDTO dto = new AccountDTO();
			dto.setUsername("Test1234");
			dto.setAccounttype("SBA");
			dto.setBranchcode("BRANCH11");
			dto.setCurrency("INR");
			dto.setIsactive("Y");
			dto.setOpendate(new Date());
			// dto.setUserDTO(userDTO);
			AdminUserDTO userDTO = new AdminUserDTO();
			userDTO.setUsername("Test1235");

			dto.setUserDTO(userDTO);

			dao.insert(dto);
			System.out.println("Inserted with no " + dto.getAccountId());
		} catch (DatabaseException e) {
			e.printStackTrace();
			Assert.fail(e.getMessage());
		}
	}

	@Test
	@Ignore
	public void get() {
		try {
			AccountDTO dto = dao.get(1001l);
			System.out.println(dto);
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
