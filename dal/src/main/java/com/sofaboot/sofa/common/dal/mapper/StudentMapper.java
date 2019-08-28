package com.sofaboot.sofa.common.dal.mapper;

import com.sofaboot.sofa.common.dal.tables.Student;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Select;

import java.util.List;

@Mapper
public interface StudentMapper {
    @Select("<script>SELECT * from test_student;</script>")
    List<Student> findAll();

    List<Student> selectAll();

    Student save(Student student);
}