import business.CourseManager;
import core.logging.DatabaseLogger;
import core.logging.FileLogger;
import core.logging.Logger;
import core.logging.MailLogger;
import dataAccess.CourseDao;
import dataAccess.HibernateCourseDao;
import dataAccess.JdbcCourseDao;
import entities.Course;

public class Main {
    public static void main(String[] args) throws Exception {

        Course course = new Course(
                "Engin Demirog",
                "Introduction",
                "Programlamaya Giris icin Temel Kurs",
                30);

        Logger[] loggers = new Logger[]{new FileLogger(),new DatabaseLogger(),new MailLogger()};
        CourseDao[] courseDaos = new CourseDao[]{new JdbcCourseDao(),new HibernateCourseDao()};

        CourseManager courseManager = new CourseManager(courseDaos, loggers);
        courseManager.add(course);
    }
}