package BUS;

import DTO.*;
import io.github.cdimascio.dotenv.Dotenv;

import java.sql.ResultSet;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;
import java.util.List;

import DAL.*;
import DAL.IDAL.IDepartmentDAL;

public class DepartmentBUS {
    private IDepartmentDAL departmentDAL;

    public DepartmentBUS(IDepartmentDAL departmentDAL) {
        this.departmentDAL = departmentDAL;
    }

    public int createDepartment(DepartmentDTO department) {
        int result = ((DepartmentDAL) this.departmentDAL).insertObject(department);
        return result;
    }

    public int updateDepartment(DepartmentDTO department) {
        int result = ((DepartmentDAL) this.departmentDAL).updateObject(department);
        return result;
    }

    public int removeDepartment(int departmentID) {
        int result = ((DepartmentDAL) this.departmentDAL).removeObject(departmentID);
        return result;
    }

    public DepartmentDTO getDepartmentByID (int departmentID) {
        DepartmentDTO result = ((DepartmentDAL) this.departmentDAL).getAnObjectByID(departmentID);
        return result;
    }

    public List<DepartmentDTO> getAllDepartment() {
        List<DepartmentDTO> result = this.departmentDAL.getAllDepartments();
        return result;
    }
}
