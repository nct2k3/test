package DTO;

public class InstructorDTO {
    private int courseID;
    private int lecturerID;
    public InstructorDTO(){};
    public InstructorDTO(int courseID, int lecturerID){
        this.courseID = courseID;
        this.lecturerID = lecturerID;
    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    public int getLecturerID() {
        return lecturerID;
    }
    public void setLecturerID(int lecturerID) {
        this.lecturerID = lecturerID;
    }
    
}
