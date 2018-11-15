package com.banking.retail.dao;

import com.banking.retail.dao.dto.AccountDTO;
import com.banking.retail.dao.ex.DatabaseException;

public interface AccountDAO {

	void insert(AccountDTO dto) throws DatabaseException;

	void update(AccountDTO dto) throws DatabaseException;

	void delete(AccountDTO dto) throws DatabaseException;

	AccountDTO get(Long accountNo) throws DatabaseException;

	AccountDTO load(Long accountNo) throws DatabaseException;

	//
	AccountDTO merge(AccountDTO dto) throws DatabaseException;

}
