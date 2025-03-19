package com.salted26.back_mybatis.service;

import com.salted26.back_mybatis.dto.CustomerDTO;
import com.salted26.back_mybatis.dto.OrderDTO;
import com.salted26.back_mybatis.dto.OrderItemDTO;
import com.salted26.back_mybatis.repository.OrderRepository;
import lombok.extern.slf4j.Slf4j;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Slf4j
@Service
public class OrderService {

  @Autowired
  private OrderRepository orderRepository;

  public List<OrderDTO> findOrderList(Integer id) {
    List<OrderDTO> orderList = orderRepository.findOrderList(id);
    return orderList;
  }

  public List<OrderItemDTO> findOrderItemList(Integer orderId) {
    List<OrderItemDTO> orderItemList = orderRepository.findOrderItemList(orderId);
    return orderItemList;
  }
}
