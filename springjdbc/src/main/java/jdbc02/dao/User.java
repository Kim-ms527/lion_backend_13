package jdbc02.dao;

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
