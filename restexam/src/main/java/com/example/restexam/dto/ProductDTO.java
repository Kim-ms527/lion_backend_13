package com.example.restexam.dto;

import com.example.restexam.domain.Product;
import lombok.*;

@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@Builder
public class ProductDTO {
    private Long id;

    private String name;
    private double price;

    //엔티티 -> DTO 로 변환하는 메서드
    public static ProductDTO fromEntity(Product product){
        return ProductDTO.builder()
                .id(product.getId())
                .name(product.getName())
                .price(product.getPrice())
                .build();
    }
}
