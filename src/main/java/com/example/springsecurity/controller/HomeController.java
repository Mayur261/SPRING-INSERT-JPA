package com.example.springsecurity.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.example.springsecurity.model.Student;
import com.example.springsecurity.repo.Studentrepo;

@Controller
public class HomeController {

	@Autowired
	private Studentrepo stu;
	
	@RequestMapping("/")
	String fun(Model m )
	{
		Student s= new Student();
		m.addAttribute("obj", s);
		
		return "index.html";
	}
	
	@RequestMapping("/data")
	ModelAndView fun1(@ModelAttribute("obj") Student s1)
	{
		System.out.println("data in u object from after" + s1);
		
		stu.save(s1);
		
		ModelAndView  mv= new ModelAndView("welcome.html");
		mv.addObject("ob", s1);
		
		return mv;
	}
}
