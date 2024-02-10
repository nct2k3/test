package BUS;

import java.sql.ResultSet;

import DAL.OnlineCourseDAL;
import DAL.IDAL.*;
import DTO.OnlineCourseDTO;

public class OnlineCourseBUS {
    private IObjectDAL onlineCourseDAL;

    public OnlineCourseBUS() {
        this.onlineCourseDAL = new OnlineCourseDAL();
    }

    public int createAnOnlineCourse(OnlineCourseDTO course) {
        int result = ((OnlineCourseDAL) this.onlineCourseDAL).insertObject(course);
        return result;
    }

    public int updateAnOnlineCourse(OnlineCourseDTO course) {
        int result = ((OnlineCourseDAL) this.onlineCourseDAL).updateObject(course);
        return result;
    }

    public int removeAnOnlineCourse(int courseID) {
        int result = ((OnlineCourseDAL) this.onlineCourseDAL).removeObject(courseID);
        return result;
    }

    public OnlineCourseDTO getAnOnlineCourse(int courseID) {
        ResultSet resultSet = (ResultSet) (((OnlineCourseDAL) this.onlineCourseDAL).getAnObjectByID(courseID));
        OnlineCourseDTO result = null;
        try {
            while(resultSet.next()) {
                result = new OnlineCourseDTO(resultSet.getInt("CourseID"), 
                    resultSet.getString("url")
                );
            }
            return result;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }
}
