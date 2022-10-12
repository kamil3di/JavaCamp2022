package entities;

public class Course {
    private String instructor;
    private String category;
    private String courseName;
    private int coursePrice;

    public Course() {
    }

    public Course(String instructor, String category, String courseName, int coursePrice) {
        this.instructor = instructor;
        this.category = category;
        this.courseName = courseName;
        this.coursePrice = coursePrice;
    }

    public String getInstructor() {
        return instructor;
    }

    public void setInstructor(String instructor) {
        this.instructor = instructor;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCourseName() {
        return courseName;
    }

    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }

    public int getCoursePrice() {
        return coursePrice;
    }

    public void setCoursePrice(int coursePrice) {
        this.coursePrice = coursePrice;
    }
}
