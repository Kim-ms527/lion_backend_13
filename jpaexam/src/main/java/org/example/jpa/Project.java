package org.example.jpa;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

import java.util.HashSet;
import java.util.Set;

@Entity
@Table(name = "projects")
@Getter@Setter
public class Project {
    @Id@GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(nullable = false)
    private String title;


    @ManyToMany(mappedBy = "projects")
    private Set<Employee> employees = new HashSet<>();
}
