package com.lingoli.domain;

import java.io.Serializable;

public class User implements Serializable {
    
    private static final long serialVersionUID = 1520961851058396786L;
    private long id;
    private String username;
    private String password;
    private Category category;
    
    public User() {}
    
    public User(long id, String username, String password, Category category) {
        this.id = id;
        this.username = username;
        this.password = password;
        this.category = category;
    }

    public long getId() {
        return id;
    }
    public void setId(long id) {
        this.id = id;
    }
    public String getUsername() {
        return username;
    }
    public void setUsername(String username) {
        this.username = username;
    }    
    public String getPassword() {
		return password;
	}
	public void setPassword(String password) {
		this.password = password;
	}
	public Category getCategory() {
        return category;
    }
    public void setCategory(Category category) {
        this.category = category;
    }
}