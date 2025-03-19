package com.salted26.back_mybatis.dto;

import lombok.*;

import java.util.Date;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class BoardDTO {

  private Long id;
  private String title;
  private String writer;
  private String content;
  private int views;
  private Date created_at;
  private Date updated_at;

}
