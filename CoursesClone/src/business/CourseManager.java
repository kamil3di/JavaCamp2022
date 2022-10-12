package business;

import dataAccess.CourseDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;

import java.util.List;

public class CourseManager {
    public CourseManager(CourseDao courseDao) {
        this.courseDao = courseDao;
    }
    private final CourseDao courseDao;

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0) {
            throw new Exception("Urun fiyati sıfırdan kucuk olamaz!");
        }
        courseDao.addCourse(course);
    }
}
