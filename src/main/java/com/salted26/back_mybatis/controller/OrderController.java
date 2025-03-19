package com.salted26.back_mybatis.controller;

import com.salted26.back_mybatis.dto.OrderDTO;
import com.salted26.back_mybatis.dto.OrderItemDTO;
import com.salted26.back_mybatis.service.OrderService;
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
@RequestMapping("/api/order")
public class OrderController {

  @Autowired
  private OrderService orderService;

  @GetMapping("/{id}")
  public ResponseEntity<List<OrderDTO>> getOrders(@PathVariable("id") Integer id) {
    List<OrderDTO> orderList = orderService.findOrderList(id);
    return new ResponseEntity<>(orderList, HttpStatus.OK);
  }

  @GetMapping("/item/{id}")
  public ResponseEntity<List<OrderItemDTO>> getOrderItems(@PathVariable("id") Integer orderId) {
    List<OrderItemDTO> orderItemList = orderService.findOrderItemList(orderId);
    return new ResponseEntity<>(orderItemList, HttpStatus.OK);
  }
}
