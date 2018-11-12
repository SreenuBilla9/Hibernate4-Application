package com.banking.retail.dao.hibernate;

import org.hibernate.Session;
import org.hibernate.Transaction;

import com.banking.retail.dao.AccountDAO;
import com.banking.retail.dao.dto.AccountDTO;
import com.banking.retail.dao.ex.DatabaseException;
import com.banking.retail.dao.util.HibernateUtil;

public class HibernateAccountDAO implements AccountDAO {

	@Override
	public void insert(AccountDTO dto) throws DatabaseException {
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
	public void update(AccountDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub
	}

	@Override
	public AccountDTO merge(AccountDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void delete(AccountDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public AccountDTO get(Long accountNo) throws DatabaseException {
		Session session = null;
		try {
			session = HibernateUtil.getOracleSession();
			return (AccountDTO) session.get(AccountDTO.class, accountNo);
		} finally {
			HibernateUtil.closeSession(session);
		}
	}

	@Override
	public AccountDTO load(Long accountNo) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void detach(AccountDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public void refresh(AccountDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

}
