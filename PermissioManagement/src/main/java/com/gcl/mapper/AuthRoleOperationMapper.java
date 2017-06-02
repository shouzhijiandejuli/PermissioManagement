package com.gcl.mapper;

import java.util.List;

import com.gcl.common.dao.MyMapper;
import com.gcl.model.AuthRoleOperation;

public interface AuthRoleOperationMapper extends MyMapper<AuthRoleOperation> {

	void batchInsert(List<AuthRoleOperation> list);

	void delRoleOpers(List<AuthRoleOperation> list);
}