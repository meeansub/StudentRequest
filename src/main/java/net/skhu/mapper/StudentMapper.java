package net.skhu.mapper;

import org.apache.ibatis.annotations.Mapper;

import net.student.dto.LoginInfo;
import net.student.dto.Student;

@Mapper
public interface StudentMapper
{
	Student findOne(int id);
	void insert(LoginInfo loginInfo);
    void update(Student student);
    void delete(int id);
}