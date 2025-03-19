package com.salted26.back_mybatis.service;

import com.salted26.back_mybatis.dto.CustomerDTO;
import com.salted26.back_mybatis.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {

  @Autowired
  private CustomerRepository customerRepository;

  public List<CustomerDTO> findAll() {
    List<CustomerDTO> customerList = customerRepository.findAll();
    return customerList;
  }

  public CustomerDTO findOne(Integer id) {
    CustomerDTO customer = customerRepository.findOne(id);
    return customer;
  }


}
