package business;
import core.logging.Logger;
import dataAccess.CourseDao;
import entities.Course;

public class CourseManager {
    public CourseManager(CourseDao[] courseDaos,Logger[] loggers) {

        this.courseDaos = courseDaos;
        this.loggers = loggers;
    }
    private CourseDao[] courseDaos;
    private Logger[] loggers;

    public void add(Course course) throws Exception {
        if (course.getCoursePrice() < 0) {
            throw new Exception("Urun fiyati sıfırdan kucuk olamaz!");
        }

        for (CourseDao courseDao: courseDaos){
            courseDao.addCourse(course);
        }

        for (Logger logger: loggers) {
            logger.log(course.getCourseName());
        }
    }
}
