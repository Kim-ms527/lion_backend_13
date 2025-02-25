### ✅ **Spring Boot `TodoController` 작성 가이드 (API 명세서)**  

## 📌 **1. API 명세서 (`TodoController`)**
**기본 URL**: `http://localhost:8080/api/todos`  

| 기능        | HTTP 메서드 | URL                     | 요청 데이터 (JSON) | 응답 데이터 (JSON) |
|------------|------------|-------------------------|--------------------|--------------------|
| 전체 할 일 조회 | `GET`     | `/api/todos`           | 없음 | `[ { "id": 1, "todo": "운동하기", "done": false }, { "id": 2, "todo": "공부하기", "done": true } ]` |
| 할 일 추가  | `POST`    | `/api/todos`           | `{ "todo": "청소하기" }` | `{ "id": 3, "todo": "청소하기", "done": false }` |
| 할 일 완료/미완료 변경 | `PATCH`  | `/api/todos/{id}` | 없음 | `{ "id": 1, "todo": "운동하기", "done": true }` |
| 할 일 삭제  | `DELETE`  | `/api/todos`           | `{ "id": 1 }` | 없음 |
| 할 일 삭제  | `DELETE`  | `/api/todos/{id}`           | 없음 | 없음 |

---

## 📌 **2. `Todo` 엔티티 클래스 (`Todo.java`)**
```java

public class Todo {   
    private Long id;

    private String todo;  // 할 일 내용
    private boolean done; // 완료 여부
}
```

---