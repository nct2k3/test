package DAL;

import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.ZoneId;
import java.time.format.DateTimeFormatter;
import java.util.ArrayList;
import java.util.List;

import DAL.IDAL.*;
import DTO.DepartmentDTO;

public class DepartmentDAL implements IObjectDAL, IDepartmentDAL{
    private DatabaseManager db;
    private static final String url = "jdbc:mysql://localhost:3306/school";
    private static final String user = "root";
    private static final String password = "";
    private static final DateTimeFormatter formatter = DateTimeFormatter.ofPattern("yyyy-MM-dd HH:mm:ss");

    public DepartmentDAL() {
        this.db = new DatabaseManager(url, user, password);
    }

    public int insertObject(Object obj) {
        DepartmentDTO department = (DepartmentDTO) obj;
        String query = "INSERT INTO `department` (`DepartmentID`, `Name`, `Budget`, `StartDate`, `Administrator`) VALUES ('" +
             department.getDepartmentID() + "', '" + 
             department.getName() + "', '" + 
             department.getBudget() + "', '" + 
             department.getStartDate() + "', '"+ 
             department.getAdministrator() +"');";
        int result = this.db.executeNonQuery(query);
        return result;
    }

    public int updateObject(Object obj) {
        DepartmentDTO department = (DepartmentDTO) obj;
        String query = "UPDATE `department` SET `Name` = '" + 
            department.getName() + "', `Budget` = " + 
            department.getBudget() + ", `StartDate` = '" + 
            department.getStartDate() + "', `Administrator` = '" + 
            department.getAdministrator() +"' WHERE `department`.`DepartmentID` = " + 
            department.getDepartmentID();
        int result = this.db.executeNonQuery(query);
        return result;
    }

    public int removeObject(int objectID) {
        // Department department = (Department) obj;
        String query = "DELETE FROM `department` WHERE `department`.`DepartmentID` = " + objectID;
        int result = this.db.executeNonQuery(query);
        return result;
    }

    public DepartmentDTO getAnObjectByID(int objectID) {
        String query = "SELECT * FROM `department` WHERE `department`.`DepartmentID` = " + objectID;
        ResultSet result = this.db.executeQuery(query);
        DepartmentDTO department = null;
        try {
            while(result.next()) {
                department = new DepartmentDTO(result.getInt("DepartmentID"), 
                    result.getString("Name"), 
                    result.getDouble("Budget"), 
                    LocalDateTime.parse(result.getString("StartDate"), formatter),  
                    result.getInt("Administrator"));
            }
            return department;
        } catch (Exception e) {
            System.out.println(e.getMessage());
            return null;
        }
    }

    public List<DepartmentDTO> getAllDepartments() {
        String query = "SELECT * FROM `department`";
        ResultSet result = this.db.executeQuery(query);
        
        List<DepartmentDTO> departments = new ArrayList<>();
        try {
            
            while(result.next()) {
                departments.add(new DepartmentDTO(result.getInt("DepartmentID"), 
                    result.getString("Name"), 
                    result.getDouble("Budget"), 
                    LocalDateTime.parse(result.getString("StartDate"), formatter),  
                    result.getInt("Administrator")));
            }
            return departments;
        } catch (Exception e) {
            System.out.println(e.getLocalizedMessage());
            return null;
        }
    }

}
