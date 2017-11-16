package com.alimama.crm.service.impl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alimama.crm.dao.CustomerDao;
import com.alimama.crm.pojo.Customer;
import com.alimama.crm.pojo.QueryVo;
import com.alimama.crm.service.CustomerService;
import com.alimama.crm.utils.Page;
@Service
public class CustomerServiceImpl implements CustomerService {
	@Autowired
	private CustomerDao customerDao;
	public Page<Customer> getCustomerList(QueryVo queryVo) {
		//计算分页起始记录
		if(queryVo.getPage()!=null){
			queryVo.setStart((queryVo.getPage()-1)*queryVo.getSize());
		}
		List<Customer> list=customerDao.getCustomerList(queryVo);
		//创建一个Page对象
		Page<Customer> page=new Page<Customer>();
		//查询总记录数
		Integer count=customerDao.getCustomerListCount(queryVo);
		page.setTotal(count);
		page.setPage(queryVo.getPage());
		page.setSize(queryVo.getSize());
		page.setRows(list);		
		return page;
	}
	public Customer getCustomerById(Long id) {
		return customerDao.getCustomerById(id);
	}
	public void updateCustomer(Customer customer) {
		customerDao.updateCustomer(customer);
		
	}
	public void deleteCustomer(Long id) {
		customerDao.deleteCustomer(id);
		
	}

}
