package com.salted26.back_mybatis.repository;

import com.salted26.back_mybatis.dto.CustomerDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class CustomerRepository {

  @Autowired
  private SqlSession sql;

  public List<CustomerDTO> findAll() {
    return sql.selectList("CustomerMapper.findAll");
  }

  public CustomerDTO findOne(Integer id) {
    return sql.selectOne("CustomerMapper.findOne", id);
  }



}
