package com.salted26.back_mybatis.repository;

import com.salted26.back_mybatis.dto.OrderDTO;
import com.salted26.back_mybatis.dto.OrderItemDTO;
import lombok.RequiredArgsConstructor;
import lombok.extern.slf4j.Slf4j;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Slf4j
@Repository
@RequiredArgsConstructor
public class OrderRepository {

  @Autowired
  private SqlSession sql;

  public List<OrderDTO> findOrderList(Integer id) {
    return sql.selectList("OrderMapper.findOrderList", id);
  }

  public List<OrderItemDTO> findOrderItemList(Integer orderId) {
    return sql.selectList("OrderItemMapper.findOrderItemList", orderId);
  }
}
