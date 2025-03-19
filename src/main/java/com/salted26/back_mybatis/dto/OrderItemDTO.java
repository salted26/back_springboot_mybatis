package com.salted26.back_mybatis.dto;

import lombok.*;

import java.io.Serializable;

@Getter
@Setter
@ToString
@NoArgsConstructor
@AllArgsConstructor
public class OrderItemDTO extends OrderDTO {

  private Long id;
  private int orderId;
  private int productId;
  private double unitPrice;
  private int quantity;

  private String productName;
}
