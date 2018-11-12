package com.banking.retail.dao;

import com.banking.retail.dao.dto.AdminUserDTO;
import com.banking.retail.dao.ex.DatabaseException;

public interface AdminUserDAO {

	void insertAdminUser(AdminUserDTO dto) throws DatabaseException;

	AdminUserDTO mergeAdminUser(AdminUserDTO dto) throws DatabaseException;

	void deleteAdminUser(AdminUserDTO dto) throws DatabaseException;

	AdminUserDTO getUserByUsername(String username) throws DatabaseException;

	AdminUserDTO loadUserByUsername(String username) throws DatabaseException;

	void detachAdminUser(AdminUserDTO dto) throws DatabaseException;

	void refreshAdminUser(AdminUserDTO dto) throws DatabaseException;

}
