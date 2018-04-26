package com.sptpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.Teacher;
import com.sptpc.persistence.TeacherMapper;

@Service
public class TeacherService {
	@Autowired
	private TeacherMapper teacherMapper;

	public List<Teacher> getAllTeacher() {
		// TODO Auto-generated method stub
		return teacherMapper.queryAllTeacher();
	}

}
