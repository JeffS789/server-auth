package io.artfx.auth.entity;

import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class User {
    @Id
    private String uuid;
    private String username;
    private String password;
}
