###  Product api 
---
** Base URL:** `/api/products`  

| 메서드 | 엔드포인트         | 요청 데이터   | 응답 데이터 | 설명 |
|--------|-----------------|--------------|------------|-----|
| `POST` | `/api/products` | `ProductDTO` | `ProductDTO` | 새로운 상품 추가 |
| `GET`  | `/api/products` | 없음 | `List<ProductDTO>` | 모든 상품 조회 |
| `GET`  | `/api/products/{id}` | 없음 | `ProductDTO` | 특정 상품 조회 |
| `PUT`  | `/api/products/{id}` | `ProductDTO` | `ProductDTO` | 상품 정보 업데이트 |
| `DELETE` | `/api/products/{id}` | 없음 | `String` | 특정 상품 삭제 |

---

## **1 Entity (`Product`)**
```java

public class Product {
    
     private Long id;

    private String name;
    private double price;
}
```


## **2 Repository (`ProductRepository`)**
```java
import org.springframework.data.jpa.repository.JpaRepository;

public interface ProductRepository extends JpaRepository<Product, Long> {
}
```

---

## **3 Service (`ProductService`)**
```java

public class ProductService {
    
   
}
```
✔ **CRUD 기능 구현**  
✔ **예외 처리 (`상품이 없을 경우`)**  
✔ **`@Transactional` 사용하여 DB 반영**  

---

## **4 Controller (`ProductController`)**
```java

public class ProductController {
    
}
```
✔ **CRUD API 구현**  
✔ **`ResponseEntity`로 상태 코드 반환**  

---

## ** 실행 방법**

**실행 후 API 테스트**  
- `POST /api/products` → 새 상품 추가  
- `GET /api/products` → 모든 상품 조회  
- `GET /api/products/{id}` → 특정 상품 조회  
- `PUT /api/products/{id}` → 상품 정보 수정  
- `DELETE /api/products/{id}` → 상품 삭제  

---


## **1️⃣ 상품 추가 (`POST /api/products`)**  
```sh
curl -X POST "http://localhost:8080/api/products" \
     -H "Content-Type: application/json" \
     -d '{
          "name": "Laptop",
          "price": 1200.50
         }'
```
✅ **설명:**  
- `-X POST` → `POST` 요청  
- `-H "Content-Type: application/json"` → JSON 요청 본문 사용  
- `-d` → 데이터 전송 (`name`, `price` 포함)  
- **결과:** 새 상품이 추가되고, `id`가 부여됨  

---

## **2️⃣ 모든 상품 조회 (`GET /api/products`)**
```sh
curl -X GET "http://localhost:8080/api/products" \
     -H "Accept: application/json"
```
✅ **설명:**  
- `-X GET` → `GET` 요청  
- `-H "Accept: application/json"` → JSON 형식으로 응답 요청  
- **결과:** 전체 상품 목록 반환  

---

## **3️⃣ 특정 상품 조회 (`GET /api/products/{id}`)**
```sh
curl -X GET "http://localhost:8080/api/products/1" \
     -H "Accept: application/json"
```
✅ **설명:**  
- `{id}` 부분을 조회할 상품의 ID로 변경  
- **결과:** 해당 `id`의 상품 정보 반환  

---

## **4️⃣ 상품 수정 (`PUT /api/products/{id}`)**
```sh
curl -X PUT "http://localhost:8080/api/products/1" \
     -H "Content-Type: application/json" \
     -d '{
          "name": "Updated Laptop",
          "price": 1300.00
         }'
```
✅ **설명:**  
- `{id}` 부분을 수정할 상품의 ID로 변경  
- `name`과 `price`를 변경한 데이터 전송  
- **결과:** 상품 정보가 업데이트됨  

---

## **5️⃣ 상품 삭제 (`DELETE /api/products/{id}`)**
```sh
curl -X DELETE "http://localhost:8080/api/products/1"
```
✅ **설명:**  
- `{id}` 부분을 삭제할 상품의 ID로 변경  
- **결과:** 상품이 삭제됨  

---

| HTTP Method | cURL Command |
|------------|-------------|
| `POST` (상품 추가) | `curl -X POST "http://localhost:8080/api/products" -H "Content-Type: application/json" -d '{ "name": "Laptop", "price": 1200.50 }'` |
| `GET` (모든 상품 조회) | `curl -X GET "http://localhost:8080/api/products" -H "Accept: application/json"` |
| `GET` (특정 상품 조회) | `curl -X GET "http://localhost:8080/api/products/1" -H "Accept: application/json"` |
| `PUT` (상품 수정) | `curl -X PUT "http://localhost:8080/api/products/1" -H "Content-Type: application/json" -d '{ "name": "Updated Laptop", "price": 1300.00 }'` |
| `DELETE` (상품 삭제) | `curl -X DELETE "http://localhost:8080/api/products/1"` |

