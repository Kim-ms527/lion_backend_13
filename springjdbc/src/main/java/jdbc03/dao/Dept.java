package jdbc03.dao;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
public class Dept {
//    public Dept(){}  //티폴트 생성자   @NoArgsConstructor

//    public Dept(Long id, String deptName, String location) {   //@AllArgsConstructor
//        this.id = id;
//        this.deptName = deptName;
//        this.location = location;
//    }

    private Long id;
    private String deptName;
    private String location;
}
