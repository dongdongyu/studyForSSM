package com.alimama.crm.dao;

import java.util.List;

import com.alimama.crm.pojo.Customer;
import com.alimama.crm.pojo.QueryVo;

public interface CustomerDao {
	List<Customer> getCustomerList(QueryVo queryVo);

	Integer getCustomerListCount(QueryVo queryVo);
	
	Customer getCustomerById(Long id);

	void updateCustomer(Customer customer);

	void deleteCustomer(Long id);
	
}
