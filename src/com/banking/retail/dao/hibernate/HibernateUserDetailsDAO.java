package com.banking.retail.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.banking.retail.dao.UserDetailsDAO;
import com.banking.retail.dao.dto.UserDetailsDTO;
import com.banking.retail.dao.ex.DatabaseException;
import com.banking.retail.dao.util.HibernateUtil;

public class HibernateUserDetailsDAO implements UserDetailsDAO {

	@Override
	public void insert(UserDetailsDTO dto) throws DatabaseException {
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
	public void update(UserDetailsDTO dto) throws DatabaseException {
		Session session = null;
		Transaction tx = null;

		try {
			session = HibernateUtil.getOracleSession();
			tx = session.getTransaction();
			tx.begin();
			session.update(dto);
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
	public void delete(UserDetailsDTO dto) throws DatabaseException {
		Session session = null;
		Transaction tx = null;

		try {
			session = HibernateUtil.getOracleSession();
			tx = session.getTransaction();
			tx.begin();
			session.delete(dto);
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
	public UserDetailsDTO get(String username) throws DatabaseException {
		Session session = null;
		UserDetailsDTO userDetailsDTO = null;
		try {
			session = HibernateUtil.getOracleSession();
			userDetailsDTO = (UserDetailsDTO) session.get(UserDetailsDTO.class, username);
		} catch (Exception e) {
			throw e;
		} finally {
			HibernateUtil.closeSession(session);
		}
		return userDetailsDTO;
	}

	@Override
	public UserDetailsDTO load(String username) throws DatabaseException {
		Session session = null;
		UserDetailsDTO userDetailsDTO = null;
		try {
			session = HibernateUtil.getOracleSession();
			userDetailsDTO = (UserDetailsDTO) session.load(UserDetailsDTO.class, username);
		} catch (Exception e) {
			throw e;
		} finally {
			HibernateUtil.closeSession(session);
		}
		return userDetailsDTO;
	}

	@Override
	public UserDetailsDTO merge(UserDetailsDTO dto) throws DatabaseException {
		Session session = null;
		UserDetailsDTO userDetailsDTO = null;
		try {
			session = HibernateUtil.getOracleSession();
			userDetailsDTO = (UserDetailsDTO) session.merge(dto);
		} catch (Exception e) {
			throw e;
		} finally {
			HibernateUtil.closeSession(session);
		}
		return userDetailsDTO;
	}

}
