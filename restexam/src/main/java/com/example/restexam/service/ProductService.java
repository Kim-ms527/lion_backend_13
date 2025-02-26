package com.example.restexam.service;

import com.example.restexam.domain.Product;
import com.example.restexam.dto.ProductDTO;
import com.example.restexam.repository.ProductRepository;
import lombok.RequiredArgsConstructor;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

@Service
@RequiredArgsConstructor
public class ProductService {
    private final ProductRepository productRepository;

    //상품추가
    @Transactional
    public ProductDTO createProduct(ProductDTO productDTO){
        //DTO를 Entity로 변환
////        Product product = new Product(null, productDTO.getName(), productDTO.getPrice());
//        Product product = new Product();
//        product.setName(productDTO.getName());
//        product.setPrice(productDTO.getPrice());//이렇게 변환하는거 어때요?

        Product product = Product.fromDTO(productDTO);

        Product createProduct = productRepository.save(product);
//        productDTO.setId(createProduct.getId());
        return ProductDTO.fromEntity(createProduct);
    }
    @Transactional(readOnly = true)
    public List<ProductDTO> getProducts(){
        return productRepository.findAll().stream()
                .map(ProductDTO::fromEntity)
                .collect(Collectors.toList());
    }

    //특정상품 조회
    @Transactional(readOnly = true)
    public ProductDTO getProductById(Long id){
        Product product = productRepository.findById(id)
                .orElseThrow(() -> new RuntimeException("상품이 없어요 ㅠㅠ" + id));
        return ProductDTO.fromEntity(product);
    }

    //상품정보 업데이트
    @Transactional
    public ProductDTO updateProduct(ProductDTO productDTO){
        Product product = productRepository.findById(productDTO.getId())
                .orElseThrow(() -> new RuntimeException("수정 할 상품이 없어요 " + productDTO.getId()));


        Optional.ofNullable(productDTO.getName()).ifPresent(product::setName);
//
//        if(productDTO.getName() != null)
//            product.setName(productDTO.getName());

//        if(productDTO.getPrice() != 0.0)     //double  --> Double  차이점.  0.0
            product.setPrice(productDTO.getPrice());


        return ProductDTO.fromEntity(product);
    }

    //상품삭제
    @Transactional
    public void deleteProduct(Long id){
        if(!productRepository.existsById(id)){
            throw  new RuntimeException("삭제할 상품이 없습니다."+id);
        }
        productRepository.deleteById(id);
    }

}
