### ** Event 엔티티 기반 기본 API 명세 & cURL 명령어**  

---

## **✅ 1. API 명세 **
| 메서드 | 엔드포인트          | 요청 데이터      | 응답 데이터   | 설명 |
|--------|------------------|--------------|-------------|------|
| `POST` | `/api/events`   | `Event` JSON | `Event` JSON | 새 이벤트 추가 |
| `GET`  | `/api/events`   | 없음         | `List<Event>` JSON | 모든 이벤트 조회 |
| `GET`  | `/api/events/{id}` | 없음         | `Event` JSON | 특정 이벤트 조회 |
| `PUT`  | `/api/events/{id}` | `Event` JSON | `Event` JSON | 이벤트 수정 |
| `DELETE` | `/api/events/{id}` | 없음         | `String` | 특정 이벤트 삭제 |

---

## **✅ 2. `curl` 명령어**
### **📌 1️⃣ 이벤트 추가 (`POST /api/events`)**
```sh
curl -X POST "http://localhost:8080/api/events" \
     -H "Content-Type: application/json" \
     -d '{
          "title": "Spring Boot Workshop",
          "description": "Learn Spring Boot with hands-on exercises."
         }'
```
📌 **응답 예시 (201 Created)**
```json
{
    "id": 1,
    "title": "Spring Boot Workshop",
    "description": "Learn Spring Boot with hands-on exercises."
}
```

---

### **📌 2️⃣ 모든 이벤트 조회 (`GET /api/events`)**
```sh
curl -X GET "http://localhost:8080/api/events" -H "Accept: application/json"
```
📌 **응답 예시 (200 OK)**
```json
[
    {
        "id": 1,
        "title": "Spring Boot Workshop",
        "description": "Learn Spring Boot with hands-on exercises."
    }
]
```

---

### **📌 3️⃣ 특정 이벤트 조회 (`GET /api/events/{id}`)**
```sh
curl -X GET "http://localhost:8080/api/events/1" -H "Accept: application/json"
```
📌 **응답 예시 (200 OK)**
```json
{
    "id": 1,
    "title": "Spring Boot Workshop",
    "description": "Learn Spring Boot with hands-on exercises."
}
```

---

### **📌 4️⃣ 이벤트 수정 (`PUT /api/events/{id}`)**
```sh
curl -X PUT "http://localhost:8080/api/events/1" \
     -H "Content-Type: application/json" \
     -d '{
          "title": "Updated Spring Boot Workshop",
          "description": "Updated description for the workshop."
         }'
```
📌 **응답 예시 (200 OK)**
```json
{
    "id": 1,
    "title": "Updated Spring Boot Workshop",
    "description": "Updated description for the workshop."
}
```

---

### **📌 5️⃣ 이벤트 삭제 (`DELETE /api/events/{id}`)**
```sh
curl -X DELETE "http://localhost:8080/api/events/1"
```
📌 **응답 예시 (200 OK)**
```
"이벤트가 삭제되었습니다."
```

---
