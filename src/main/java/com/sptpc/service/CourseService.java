package com.sptpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.Course;
import com.sptpc.domain.Userlogin;
import com.sptpc.persistence.CourseMapper;

@Service
public class CourseService {
	@Autowired
	private CourseMapper courseMapper;

	//得到所有的课程信息
	public List<Course> getAllCourse() {
		// TODO Auto-generated method stub
		return courseMapper.getAllCourse();
	}

	public Course findCourseByID(String userID) {
		// TODO Auto-generated method stub
		return courseMapper.getCourseByID(Integer.parseInt(userID));
	}

	public int updateCourse(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.updateCourse(course);
	}

	//删除课程信息(CourseService类)
	public int deleteCourseByID(String userID) {
		// TODO Auto-generated method stub
		int n = courseMapper.deleteSelectCourseByID(Integer.parseInt(userID));
		return courseMapper.deleteCourserByID(Integer.parseInt(userID));
	}

	public int saveCourse(Course course) {
		// TODO Auto-generated method stub
		return courseMapper.insertCourse(course);
	}

	public List<Course> getCourseByTeacher(Userlogin teacher) {
		// TODO Auto-generated method stub
		return courseMapper.getCourseByTecID(Integer.parseInt(teacher.getUserName()));
	}
	

}
