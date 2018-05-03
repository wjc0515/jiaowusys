package com.sptpc.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sptpc.domain.Course;

@Repository
public interface CourseMapper {

	//得到所有的课程信息
	List<Course> getAllCourse();

	Course getCourseByID(int id);

	int updateCourse(Course course);

	int deleteCourserByID(int parseInt);
	
	int deleteSelectCourseByID(int id);

	int insertCourse(Course course);

	List<Course> getCourseByTecID(int userID);

}
