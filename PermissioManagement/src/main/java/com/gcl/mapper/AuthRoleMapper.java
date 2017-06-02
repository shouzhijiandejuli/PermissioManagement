package com.gcl.mapper;

import org.apache.ibatis.annotations.Param;

import com.gcl.common.dao.MyMapper;
import com.gcl.model.AuthRole;

public interface AuthRoleMapper extends MyMapper<AuthRole> {

	AuthRole queryRoleById(@Param("roleid")Integer roleid);
	
	AuthRole queryByRolename(@Param("rolename") String rolename);
}