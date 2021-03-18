package com.webwork.dao;

import com.webwork.entity.Student;
import com.webwork.entity.Teacher;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;

public interface StudentDao extends JpaRepository<Teacher,Integer> {

    @Query(value="select * from student where stu_name=?",nativeQuery=true)
    Student findByUserName(String username);



}
