package com.alimama.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimama.crm.dao.BaseDictDao;
import com.alimama.crm.pojo.BaseDict;
import com.alimama.crm.service.BaseDictService;
@Service
public class BaseDicServiceImpl implements BaseDictService {
	@Autowired
	private BaseDictDao baseDictDao;
	public List<BaseDict> getDictListByTypeCode(String typeCode) {
		return baseDictDao.getDictListByTypeCode(typeCode);
	}	

}
