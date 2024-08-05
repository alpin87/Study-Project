package com.example.preonboarding.domain;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Builder;
import lombok.Getter;
import lombok.NoArgsConstructor;
import org.hibernate.annotations.ColumnDefault;

@Entity
@NoArgsConstructor
@AllArgsConstructor
@Builder
@Table(name = "users")
public class User {

    @Id
    @Getter
    @Column(name = "user_id")
    private Long id;

    @Getter
    @Column(name = "user_name")
    private String username;


    @Column(name = "user_passwd")
    private String password;

    @Enumerated(EnumType.STRING)
    @ColumnDefault("'USER'")
    @Column(name = "user_role")
    @Getter
    private String role;
}
