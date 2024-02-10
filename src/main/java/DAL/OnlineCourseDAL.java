package DAL;

import java.sql.ResultSet;

import DAL.IDAL.IObjectDAL;
import DTO.*;

public class OnlineCourseDAL implements IObjectDAL{
    private DatabaseManager db;
    private static final String url = "jdbc:mysql://localhost:3306/school";
    private static final String user = "root";
    private static final String password = "";

    public OnlineCourseDAL() {
        this.db = new DatabaseManager(url, user, password);
    }

    public int insertObject(Object obj) {
        OnlineCourseDTO onlineCourse = (OnlineCourseDTO) obj;
        String query = "INSERT INTO `onlinecourse` (`CourseID`, `url`) VALUES (" +
            onlineCourse.getCourseID() + ", '" + 
            onlineCourse.getUrl() + "');";
        int result = this.db.executeNonQuery(query);
        return result;
    }

    public int updateObject(Object obj) {
        OnlineCourseDTO onlineCourse = (OnlineCourseDTO) obj;
        String query = "UPDATE `onlinecourse` SET `url` = '" + 
            onlineCourse.getUrl() + "' WHERE `onlinecourse`.`CourseID` = " + 
            onlineCourse.getCourseID();
        int result = this.db.executeNonQuery(query);
        return result;
    }

    public int removeObject(int objectID) {
        // Department department = (Department) obj;
        String query = "DELETE FROM `onlinecourse` WHERE `onlinecourse`.`CourseID` = " + objectID;
        int result = this.db.executeNonQuery(query);
        return result;
    }

    public Object getAnObjectByID(int objectID) {
        String query = "SELECT * FROM `onlinecourse` where `CourseID` = " + objectID;
        ResultSet result = this.db.executeQuery(query);
        return result;
    }
}
