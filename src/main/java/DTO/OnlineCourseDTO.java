package DTO;

public class OnlineCourseDTO {
    private int courseID;
    private String url;

    public OnlineCourseDTO(){};
    public OnlineCourseDTO(int courseID, String url){
        this.courseID = courseID;
        this.url = url;
    }
    public int getCourseID() {
        return courseID;
    }
    public void setCourseID(int courseID) {
        this.courseID = courseID;
    }
    public String getUrl() {
        return url;
    }
    public void setUrl(String url) {
        this.url = url;
    }
}
