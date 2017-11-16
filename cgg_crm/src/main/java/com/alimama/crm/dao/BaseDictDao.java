package com.alimama.crm.dao;

import java.util.List;

import com.alimama.crm.pojo.BaseDict;

public interface BaseDictDao {
	List<BaseDict> getDictListByTypeCode(String typeCode);
}
