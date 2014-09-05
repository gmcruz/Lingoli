package com.lingoli.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.lingoli.dataaccess.UserDAOInterface;
import com.lingoli.domain.User;


@Controller
public class IndexController {
	
	@Autowired
	private UserDAOInterface userDao;
	
	@RequestMapping(value="/")
	public ModelAndView home() {
		List<User> listUsers = userDao.list();
		ModelAndView model = new ModelAndView("index");
		model.addObject("userList", listUsers);
		return model;
	}
	
}
