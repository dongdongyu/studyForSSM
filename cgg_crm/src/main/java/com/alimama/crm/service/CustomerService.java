package com.alimama.crm.service;

import com.alimama.crm.pojo.Customer;
import com.alimama.crm.pojo.QueryVo;
import com.alimama.crm.utils.Page;

public interface CustomerService {
	Page<Customer> getCustomerList(QueryVo queryVo);

	Customer getCustomerById(Long id);

	void updateCustomer(Customer customer);

	void deleteCustomer(Long id);
}
