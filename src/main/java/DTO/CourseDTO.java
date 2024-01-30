package DTO;

public class CourseDTO {
    private int courseID;
    private int departmentID;
    private String title;
    private String credits;

    public CourseDTO(){};
    public CourseDTO(int courseID, int departmentID, String title, String credits){
        this.courseID = courseID;
        this.departmentID = departmentID;
        this.title = title;
        this.credits = credits;
    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    public int getDepartmentID() {
        return departmentID;
    }
    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }
    public String getTitle() {
        return title;
    }
    public void setTitle(String title) {
        this.title = title;
    }
    public String getCredits() {
        return credits;
    }
    public void setCredits(String credits) {
        this.credits = credits;
    }

    
}
