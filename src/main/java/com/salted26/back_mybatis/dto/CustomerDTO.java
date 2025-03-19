package com.salted26.back_mybatis.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class CustomerDTO {

  private Long id;
  private String firstName;
  private String lastName;
  private String city;
  private String country;
  private String phone;
}
