package com.salted26.back_mybatis.controller;

import com.salted26.back_mybatis.dto.CustomerDTO;
import com.salted26.back_mybatis.service.CustomerService;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Slf4j
@CrossOrigin(origins = "http://localhost:3000/*, *")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/customer")
public class CustomerController {

  @Autowired
  private CustomerService customerService;



  @GetMapping("")
  public ResponseEntity<List<CustomerDTO>> getCustomer() {
    List<CustomerDTO> customerList = customerService.findAll();
    return new ResponseEntity<>(customerList, HttpStatus.OK);
  }

  @GetMapping("/{id}")
  public ResponseEntity<CustomerDTO> getCustomer(@PathVariable Integer id) {
    CustomerDTO customer = customerService.findOne(id);
    return new ResponseEntity<>(customer, HttpStatus.OK);
  }

}
