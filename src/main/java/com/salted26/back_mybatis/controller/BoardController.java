package com.salted26.back_mybatis.controller;

import com.salted26.back_mybatis.dto.BoardDTO;
import com.salted26.back_mybatis.service.BoardService;
import lombok.RequiredArgsConstructor;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@CrossOrigin("*")
@RestController
@RequiredArgsConstructor
@RequestMapping("/api/board")
public class BoardController {

  @Autowired
  private BoardService boardService;

  @GetMapping("")
  public ResponseEntity<List<BoardDTO>> findAll() {
    try {
      List<BoardDTO> boardList = boardService.findAllBoard();
      return new ResponseEntity<>(boardList, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }

  @GetMapping("/{no}")
  public  ResponseEntity<BoardDTO> findOne(@PathVariable("no") Long no) {
    try {
      BoardDTO board = boardService.findOne(no);
      return new ResponseEntity<>(board, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  // json 데이터를 받기 위해서 @RequestBody 어노테이션을 입력해주어야 한다.
  @PostMapping("/write")
  public ResponseEntity<BoardDTO> save(@RequestBody BoardDTO boardDTO) {
    try {
      boardService.save(boardDTO);
      return new ResponseEntity<>(boardDTO, HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @PostMapping("/update/{no}")
  public ResponseEntity<BoardDTO> update(
    @PathVariable Long no, @RequestBody BoardDTO boardDTO) {
    try {
      boardDTO.setNo(no);
      boardService.update(boardDTO);
      return new ResponseEntity<>(boardDTO, HttpStatus.OK);
    } catch (Exception e) {
      return  new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }
  }



  @PostMapping("/delete/{no}")
  public ResponseEntity<?> delete(@PathVariable("no") Long no) {
    try {
      boardService.delete(no);
      return new ResponseEntity<>("delete success", HttpStatus.OK);
    } catch (Exception e) {
      return new ResponseEntity<>(null, HttpStatus.INTERNAL_SERVER_ERROR);
    }

  }

  @GetMapping("/test")
  public String test() {
    return "backend 테스트 진행중입니다.";
  }
}
