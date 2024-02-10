package DTO;

public class CourseDTO {
    private int courseID;
    private int departmentID;
    private String title;
    private int credits;

    public CourseDTO(){};
    public CourseDTO(int courseID, int departmentID, String title, int credits){
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
    public int getCredits() {
        return credits;
    }
    public void setCredits(int credits) {
        this.credits = credits;
    }

    
}
