package com.salted26.back_mybatis.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class SupplierDTO {

  private Long id;
  private String companyName;
  private String contactName;
  private String city;
  private String country;
  private String phone;
  private String fax;
}
