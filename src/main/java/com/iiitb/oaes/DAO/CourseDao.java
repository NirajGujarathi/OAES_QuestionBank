package com.iiitb.oaes.DAO;

import com.iiitb.oaes.Bean.Course;

import java.util.List;

public interface CourseDao {
    boolean createCourse(Course course);
    List<Course> getCourses();
    Course getCourseById(Integer courseId);
}
