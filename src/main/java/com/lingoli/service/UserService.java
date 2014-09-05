package com.lingoli.service;

import java.util.List;

import com.lingoli.domain.User;
import com.lingoli.domain.Category;

public interface UserService {
    
    List<Category> getAllCategories();
    Category getCategory(int id);
    List<User> getAllUsers();
    User save(User user);
    User update(User user);
    User get(long id);
    long getNextId();

}
