package com.briup.apps.app02.service;

import com.briup.apps.app02.bean.Course;

import java.util.List;

public interface ICouseService {
    List<Course> findAll();
    Course findById(long id);
}