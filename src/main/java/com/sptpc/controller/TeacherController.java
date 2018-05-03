package com.sptpc.controller;

import java.util.List;

import javax.servlet.http.HttpSession;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.servlet.ModelAndView;

import com.sptpc.domain.Course;
import com.sptpc.domain.Userlogin;
import com.sptpc.service.CourseService;

@Controller
public class TeacherController {
	@Autowired
	private CourseService courseService;

	@RequestMapping(value="ctr_tecShowCourse")
	public ModelAndView showCourse(HttpSession session){
		ModelAndView mv = new ModelAndView("teacher/showCourse");
		Userlogin teacher = (Userlogin) session.getAttribute("ul");		
//		List<Course> courseList = courseService.getCourseByTecID(teacher.getUserID());
		List<Course> courseList = courseService.getCourseByTeacher(teacher);
		mv.addObject("courseList", courseList);
		return mv;
	}
}
