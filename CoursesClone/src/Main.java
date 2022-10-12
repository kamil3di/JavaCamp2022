import business.CourseManager;
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

        CourseManager courseManager = new CourseManager(new HibernateCourseDao());
        courseManager.add(course);
    }
}