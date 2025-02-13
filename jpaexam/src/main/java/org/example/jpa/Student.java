package org.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity
@Table(name = "students")
@NoArgsConstructor
@Getter@Setter
public class Student {  //연관관계의 주인
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String name;

    @ManyToOne
    @JoinColumn(name = "school_id")
    private School school;

    public Student(String name, School school) {
        this.name = name;
        this.school = school;
    }
}
