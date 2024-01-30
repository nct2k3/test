package DTO;

public class StudentGradeDTO {
    private int enrollmentID;
    private Double grade;
    private StudentDTO student;
    private CourseDTO course;
    public StudentGradeDTO(){};
    public StudentGradeDTO(int enrollmentID, Double grade, StudentDTO student, CourseDTO course){
        this.enrollmentID = enrollmentID;
        this.grade = grade;
        this.student = student;
        this.course = course;
    }
    public int getEnrollmentID() {
        return enrollmentID;
    }
    public void setEnrollmentID(int enrollmentID) {
        this.enrollmentID = enrollmentID;
    }
    public Double getGrade() {
        return grade;
    }
    public void setGrade(Double grade) {
        this.grade = grade;
    }
    public StudentDTO getStudent() {
        return student;
    }
    public void setStudent(StudentDTO student) {
        this.student = student;
    }
    public CourseDTO getCourse() {
        return course;
    }
    public void setCourse(CourseDTO course) {
        this.course = course;
    }
}
