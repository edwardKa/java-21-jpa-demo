package com.company.model;

import lombok.*;

import javax.persistence.*;

@Entity
@Table(name = "USER")
@AllArgsConstructor
@NoArgsConstructor
@Getter
@Setter
@Builder
@ToString
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private Integer id;


    @Column(unique = true, nullable = false)
    private String username;

    private String firstName;

    private String lastName;
}
