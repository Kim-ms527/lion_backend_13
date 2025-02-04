package jdbc01;

import lombok.*;

@Getter
@AllArgsConstructor
@NoArgsConstructor
@ToString
@Setter
public class User {
    private Long id;
    private String name;
    private String email;
}
