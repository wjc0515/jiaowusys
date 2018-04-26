package com.sptpc.persistence;
import java.util.List;

import org.springframework.stereotype.Repository;

import com.sptpc.domain.Teacher;

@Repository
public interface TeacherMapper {

	List<Teacher> queryAllTeacher();

}
