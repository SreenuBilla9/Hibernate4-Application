package com.banking.retail.dao;

import com.banking.retail.dao.dto.UserDetailsDTO;
import com.banking.retail.dao.ex.DatabaseException;

public interface UserDetailsDAO {

	void insert(UserDetailsDTO dto) throws DatabaseException;

	void update(UserDetailsDTO dto) throws DatabaseException;

	void delete(UserDetailsDTO dto) throws DatabaseException;

	UserDetailsDTO get(String username) throws DatabaseException;

	UserDetailsDTO load(String username) throws DatabaseException;

	//
	UserDetailsDTO merge(UserDetailsDTO dto) throws DatabaseException;

	void detach(UserDetailsDTO dto) throws DatabaseException;

	void refresh(UserDetailsDTO dto) throws DatabaseException;

}
