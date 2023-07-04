package com.modele;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

@Entity // pour que cette classe puisse étre mapper avec une table de la bd
@Table(name = "USERS") // pour donner le nom de la table

@Getter
@Setter
@NoArgsConstructor
public class Users {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;
    @Column(length = 50)
    private String email;
    @Column(length = 150)
    private String password;
    @Column(length = 150)
    private String confirmPassword;

}
