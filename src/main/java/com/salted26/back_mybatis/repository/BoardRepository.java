package com.salted26.back_mybatis.repository;

import com.salted26.back_mybatis.dto.BoardDTO;
import lombok.RequiredArgsConstructor;
import org.apache.ibatis.session.SqlSession;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
@RequiredArgsConstructor
public class BoardRepository{

  @Autowired
  private SqlSession sql;

  public List<BoardDTO> findAll() {
    return sql.selectList("BoardMapper.findAll");
  }

  public BoardDTO findOne(Long no) {
    return sql.selectOne("BoardMapper.findOne", no);
  }

  public void update(BoardDTO boardDTO) {
    sql.update("BoardMapper.update", boardDTO);
  }

  public void save(BoardDTO boardDTO) {
    sql.insert("BoardMapper.save", boardDTO);
  }

  public void delete(Long no) {
    sql.delete("BoardMapper.delete", no);
  }

}
