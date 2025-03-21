package com.salted26.back_mybatis.service;

import com.salted26.back_mybatis.dto.BoardDTO;
import com.salted26.back_mybatis.repository.BoardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class BoardService {

  @Autowired
  private BoardRepository boardRepository;

  public List<BoardDTO> findAllBoard() {
    return boardRepository.findAll();

  }

  public BoardDTO findOne(Long id) {
    return boardRepository.findOne(id);
  }

  public void update(BoardDTO boardDTO) {
    boardRepository.update(boardDTO);
  }

  public void save(BoardDTO boardDTO) {
    boardRepository.save(boardDTO);
  }

  public void delete(Long id) {
    boardRepository.delete(id);
  }
}
