package dataAccess;

import entities.Course;

public class HibernateCourseDao implements CourseDao{
    @Override
    public void addCourse(Course course) {
        System.out.println(course.getCourseName() + " kursu Hibernate veritabanina eklendi!");
    }
}
