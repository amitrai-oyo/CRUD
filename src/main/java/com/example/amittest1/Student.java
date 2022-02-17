package com.example.amittest1;

import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;

@Table(name = "student")
@Entity
@AllArgsConstructor
@ToString
@NoArgsConstructor
@Getter
@Setter
public class Student {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Long studentid;
    private String firstname;
    private String branch;

}
