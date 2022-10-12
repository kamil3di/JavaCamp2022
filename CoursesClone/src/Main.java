import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.CourseDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course1 = new Course(
                "Engin Demirog",
                "Introduction",
                "Programlamaya Giris icin Temel Kurs",
                30);

        Course course2 = new Course(
                "Engin Demirog",
                "Senior",
                "Senior Yazilim Gelistirici Yetistirme Kampi(.NET)",
                100);

        ArrayList<Course> courseList = new ArrayList<>();
        courseList.add(course1);
        courseList.add(course2);

        Logger[] loggers = new Logger[]{new FileLogger(),new DatabaseLogger(),new MailLogger()};
        CourseDao[] courseDaos = new CourseDao[]{new JdbcCourseDao(),new HibernateCourseDao()};

        CourseManager courseManager = new CourseManager(courseDaos, loggers);
        for (Course course: courseList){
            courseManager.add(course);
        }
    }
}