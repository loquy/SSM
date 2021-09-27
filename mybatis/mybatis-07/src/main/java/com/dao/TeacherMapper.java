package com.dao;

import com.pojo.Teacher;
import org.apache.ibatis.annotations.Param;

import java.util.List;

public interface TeacherMapper {

    //获取老师
    Teacher getTeacher(@Param("tid") int id);

    //获取指定老师下的所有学生及老师信息
    Teacher getTeacher2(@Param("tid") int id);
}
