package com.salted26.back_mybatis.dto;

import lombok.*;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class ProductDTO {

  private Long id;
  private String productName;
  private int supplierId;
  private double unitPrice;
  private String productPackage;
  private String isDiscounte;


}
