# URL vs URI 

### ✅ **1. 개념 정리**  

| 개념 | 설명 | 예시 |
|------|----------------|--------------------------------------------|
| **URI (Uniform Resource Identifier)** | **리소스(자원)를 식별하는 모든 문자열** | `"users/1234"`, `"mailto:abc@example.com"` |
| **URL (Uniform Resource Locator)** | **리소스의 위치(주소)와 접근 방법(프로토콜)를 포함하는 URI** | `"https://example.com/users/1234"` |

📌 **즉, URL은 URI의 한 종류!**  
**✔ 모든 URL은 URI이지만, 모든 URI가 URL은 아님!**  

---

### ✅ **2. 예제 비교 (쉽게 이해하기!)**  

| URI | URL |
|----------------|----------------------------|
| `/users/1234` | `https://example.com/users/1234` |
| `mailto:abc@example.com` | `ftp://files.example.com/download.zip` |
| `urn:isbn:0451450523` | `http://mywebsite.com/index.html` |

**🔹 URI**는 **"이 리소스가 무엇인가?"** 를 식별  
**🔹 URL**은 **"이 리소스가 어디에 있고, 어떻게 접근하는가?"** 까지 포함  

---

### ✅ **3. 포함 관계**
```
URI (리소스를 식별하는 모든 문자열)
 ├── URL (리소스의 위치 + 접근 방법)
 ├── URN (리소스의 이름, 위치X)
```
📌 **URN (Uniform Resource Name)** 예시  
- `urn:isbn:0451450523` → 책의 ISBN (위치 정보 없이 유일한 이름)  

---

### ✅ **4. 결론 (한 줄 요약!)**
| | 설명 |
|------|----------------|
| **URI** | 리소스를 식별하는 모든 문자열 |
| **URL** | 리소스의 위치와 접근 방법까지 포함하는 URI |
| **관계** | **"모든 URL은 URI이지만, 모든 URI가 URL은 아니다!"** |


