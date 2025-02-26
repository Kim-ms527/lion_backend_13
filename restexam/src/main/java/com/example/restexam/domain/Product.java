package com.example.restexam.domain;

import com.example.restexam.dto.ProductDTO;
import jakarta.persistence.*;
import lombok.*;

@Entity
@Getter
@Setter
@NoArgsConstructor
@Table(name = "products")
@AllArgsConstructor
@Builder
public class Product {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String name;
    private double price;

    //DTO -> entity로 변환하는 메서드
    public static Product fromDTO(ProductDTO productDTO){
        return Product.builder()
                .id(productDTO.getId())
                .name(productDTO.getName())
                .price(productDTO.getPrice())
                .build();
    }
}
