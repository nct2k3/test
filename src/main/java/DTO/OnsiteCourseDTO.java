package DTO;

import java.time.LocalTime;

public class OnsiteCourseDTO {
    private int courseID;
    private String location;
    private String days;
    private LocalTime time;

    public OnsiteCourseDTO(){};
    public OnsiteCourseDTO(int courseID, String location, String days, LocalTime time){
        this.courseID = courseID;
        this.location = location;
        this.days = days;
        this.time = time;
    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    public String getLocation() {
        return location;
    }
    public void setLocation(String location) {
        this.location = location;
    }
    public String getDays() {
        return days;
    }
    public void setDays(String days) {
        this.days = days;
    }
    public LocalTime getTime() {
        return time;
    }
    public void setTime(LocalTime time) {
        this.time = time;
    }
}


