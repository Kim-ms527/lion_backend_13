package spirngdatajdbc01;

//DTO - 단순하게 값만 담아서 전달되는 객체
//엔티티 - DTO의 역할도 하지만, 데이터베이스와 객체 간의 관계를 알려주는 역할도 함.

import lombok.*;
import org.springframework.data.annotation.Id;
import org.springframework.data.relational.core.mapping.Table;

@Table("users")
@Getter
@Setter
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class User {
    @Id
    private Long id;
    private String name;
    private String email;

    public User(String name, String email) {
        this.name = name;
        this.email = email;
    }
}
