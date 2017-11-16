package com.alimama.crm.service;

import java.util.List;

import com.alimama.crm.pojo.BaseDict;

public interface BaseDictService {
	List<BaseDict> getDictListByTypeCode(String typeCode);
}
