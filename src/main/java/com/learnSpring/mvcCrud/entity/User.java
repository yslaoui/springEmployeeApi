package com.learnSpring.mvcCrud.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.Collection;

@Entity
@Table(name = "users")
@Data
@NoArgsConstructor
@AllArgsConstructor
public class User {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id")
    private Long id;

    @Column(name = "username")
    private String userName;

    @Column(name = "password")
    private String password;

    @Column(name = "enabled")
    private boolean enabled;

    @ManyToMany(fetch = FetchType.EAGER, cascade = CascadeType.ALL)
    @JoinTable(name = "users_authorities",
            joinColumns = @JoinColumn(name = "user_id"),
            inverseJoinColumns = @JoinColumn(name = "authority_id"))
    private Collection<Role> roles;

    public User(String userName, String password, boolean enabled) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
    }

    // Constructor with roles included
    public User(String userName, String password, boolean enabled, Collection<Role> roles) {
        this.userName = userName;
        this.password = password;
        this.enabled = enabled;
        this.roles = roles;
    }

}
