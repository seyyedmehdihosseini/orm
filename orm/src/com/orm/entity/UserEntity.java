package com.orm.entity;

import com.orm.annotations.annotation.Column;
import com.orm.annotations.annotation.Table;

@Table(name="tbl_user")
public class UserEntity {
    @Column(name="u_id_pk",primaryKey = true)
    private Long id;
    @Column(name="u_name")
    private String name;
    @Column(name="u_username")
    private String username;


    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    @Override
    public String toString() {
        return "UserEntity{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", username='" + username + '\'' +
                '}';
    }
}
