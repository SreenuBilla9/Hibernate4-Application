package com.banking.retail.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.banking.retail.dao.AdminUserDAO;
import com.banking.retail.dao.dto.AdminUserDTO;
import com.banking.retail.dao.ex.DatabaseException;
import com.banking.retail.dao.util.HibernateUtil;

public class HibernateUserDAO implements AdminUserDAO {

	@Override
	public void insertAdminUser(AdminUserDTO dto) throws DatabaseException {
		Session session = null;
		Transaction tx = null;

		try {
			session = HibernateUtil.getOracleSession();
			tx = session.getTransaction();
			tx.begin();
			session.save(dto);
			tx.commit();
		} catch (Exception e) {
			if (tx != null)
				tx.rollback();
			throw e;
		} finally {
			HibernateUtil.closeSession(session);
		}
	}

	@Override
	public AdminUserDTO mergeAdminUser(AdminUserDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void deleteAdminUser(AdminUserDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public AdminUserDTO getUserByUsername(String username) throws DatabaseException {
		Session session = null;
		try {
			session = HibernateUtil.getOracleSession();
			return (AdminUserDTO) session.get(AdminUserDTO.class, username);
		} finally {
			HibernateUtil.closeSession(session);
		}
	}

	@Override
	public AdminUserDTO loadUserByUsername(String username) throws DatabaseException {
		Session session = null;
		AdminUserDTO obj = null;
		try {
			session = HibernateUtil.getOracleSession();
			obj = (AdminUserDTO) session.load(AdminUserDTO.class, username);
			System.out.println(obj);
		} finally {
			HibernateUtil.closeSession(session);
		}
		return obj;
	}

	@Override
	public void detachAdminUser(AdminUserDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public void refreshAdminUser(AdminUserDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

}
