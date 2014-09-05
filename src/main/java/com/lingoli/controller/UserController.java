package com.lingoli.controller;

import java.util.List;

import org.apache.commons.logging.Log;
import org.apache.commons.logging.LogFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

import com.lingoli.domain.User;
import com.lingoli.domain.Category;
import com.lingoli.service.UserService;

@Controller
public class UserController {

    @Autowired
    private UserService userService;

    private static final Log logger = LogFactory.getLog(UserController.class);

    @RequestMapping(value = "/user_input")
    public String inputUser(Model model) {
        List<Category> categories = userService.getAllCategories();
        model.addAttribute("categories", categories);
        model.addAttribute("user", new User());
        return "UserAddForm";
    }

    @RequestMapping(value = "/user_edit/{id}")
    public String editUser(Model model, @PathVariable long id) {
        List<Category> categories = userService.getAllCategories();
        model.addAttribute("categories", categories);
        User user = userService.get(id);
        model.addAttribute("user", user);
        return "UserEditForm";
    }

    @RequestMapping(value = "/user_save")
    public String saveUser(@ModelAttribute User user) {
        Category category = userService.getCategory(user.getCategory().getId());
        user.setCategory(category);
        userService.save(user);
        return "redirect:/user_list";
    }

    @RequestMapping(value = "/user_update")
    public String updateUser(@ModelAttribute User user) {
        Category category = userService.getCategory(user.getCategory().getId());
        user.setCategory(category);
        userService.update(user);
        return "redirect:/user_list";
    }

    @RequestMapping(value = "/user_list")
    public String listUsers(Model model) {
        logger.info("user_list");
        List<User> users = userService.getAllUsers();
        model.addAttribute("users", users);
        return "UserList";
    }
}