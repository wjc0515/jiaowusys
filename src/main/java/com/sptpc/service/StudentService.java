package com.sptpc.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.sptpc.domain.Student;
import com.sptpc.persistence.StudentMapper;

@Service
public class StudentService {
	@Autowired
	private StudentMapper studentMapper;
	
	//得到所有的学生信息
	public List<Student> getAllStudent(){		
		return studentMapper.getAllStudent();
	}

}
