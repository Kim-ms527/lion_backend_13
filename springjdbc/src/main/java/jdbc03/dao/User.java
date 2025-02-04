package jdbc03.dao;

import lombok.*;

@AllArgsConstructor
@Getter
@NoArgsConstructor
@ToString
@Setter
public class User {
    private Long id;
    private String name;
    private String email;
}
