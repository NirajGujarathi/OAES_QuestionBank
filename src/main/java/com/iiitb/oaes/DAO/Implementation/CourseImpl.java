package com.iiitb.oaes.DAO.Implementation;

import com.iiitb.oaes.Bean.Course;
import com.iiitb.oaes.DAO.CourseDao;
import com.iiitb.oaes.utils.SessionUtil;
import org.hibernate.HibernateException;
import org.hibernate.Session;
import org.hibernate.Transaction;
import org.hibernate.query.Query;

import java.util.ArrayList;
import java.util.List;

public class CourseImpl implements CourseDao {
    /*
        Create a Course object in the Database
        Return the created object if successful, else NULL
    */
    @Override
    public Course createCourse(Course course) {
        try (Session session = SessionUtil.getSession()) {
            Transaction transaction = session.beginTransaction();
            session.save(course);
            transaction.commit();
            return course;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }

    /*
        Return all the Courses in the Database
    */
    @Override
    public List<Course> getCourses() {
        Session session = SessionUtil.getSession();
        List<Course> courses = new ArrayList<>();

        try {
            Query query = session.createQuery("from Course");

            for (final Object course : query.list()) {
                courses.add((Course) course);
            }
            return courses;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return new ArrayList<>();
        }
    }

    /*
        Return the Course with the specified Id in the Database
        Return NULL if no Course with specified Id found
    */
    @Override
    public Course getCourseById(Integer courseId) {
        Session session = SessionUtil.getSession();

        try {
            Query query = session.createQuery("from Course where courseId=:courseId");
            query.setParameter("courseId", courseId);
            Course course = null;

            for (final Object curCourse : query.list())
                course = (Course) curCourse;

            return course;
        } catch (HibernateException exception) {
            System.out.print(exception.getLocalizedMessage());
            return null;
        }
    }
}