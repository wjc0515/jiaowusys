package com.sptpc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.servlet.ModelAndView;

import com.sptpc.domain.Student;
import com.sptpc.service.StudentService;

@Controller
public class AdminCotroller {
	@Autowired
	private StudentService studentService;

	@RequestMapping("ctr_showStudent")
	public ModelAndView showStudent(HttpSession session){
		List<Student> studentList = null;
		studentList = studentService.getAllStudent();
		ModelAndView mv = new ModelAndView("admin/showStudent");
		mv.addObject("studentList", studentList);
		
		return mv;		
	}
	
	@RequestMapping(value="ctr_addStudent",method=RequestMethod.GET)
	public ModelAndView addStudent(){
		ModelAndView mv = new ModelAndView("admin/addStudent");
		
		mv.addObject("collegeList", null);
		return mv;
	}
	@RequestMapping(value="ctr_addStudent",method=RequestMethod.POST)
	public ModelAndView sumbitStudentForm(Student student){
		
		return null;
	}
	
	
}
