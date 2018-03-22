package com.sptpc.persistence;

import java.util.List;

import org.springframework.stereotype.Repository;

import com.sptpc.domain.Student;

@Repository
public interface StudentMapper {
	public List<Student> getAllStudent();
}
