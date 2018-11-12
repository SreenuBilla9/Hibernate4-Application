package com.banking.retail.dao.hibernate;

import com.banking.retail.dao.UserDetailsDAO;
import com.banking.retail.dao.dto.AccountDTO;
import com.banking.retail.dao.dto.UserDetailsDTO;
import com.banking.retail.dao.ex.DatabaseException;

public class HibernateUserDetailsDAO implements UserDetailsDAO {

	@Override
	public void insert(UserDetailsDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public void update(UserDetailsDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public void delete(UserDetailsDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public UserDetailsDTO get(String username) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public UserDetailsDTO load(String username) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public AccountDTO merge(UserDetailsDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub
		return null;
	}

	@Override
	public void detach(UserDetailsDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

	@Override
	public void refresh(UserDetailsDTO dto) throws DatabaseException {
		// TODO Auto-generated method stub

	}

}
