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
    List<BoardDTO> boardList = boardRepository.findAll();
    return boardList;
  }

  public BoardDTO findOne(Long no) {
    return boardRepository.findOne(no);
  }

  public void update(BoardDTO boardDTO) {
    boardRepository.update(boardDTO);
  }

  public void save(BoardDTO boardDTO) {
    boardRepository.save(boardDTO);
  };

  public void delete(Long no) {
    boardRepository.delete(no);
  }
}
