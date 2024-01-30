package DTO;

import java.time.LocalDateTime;

public class DepartmentDTO {
    private int departmentID;
    private String name;
    private Double budget;
    private LocalDateTime startDate;

    public DepartmentDTO(){};
    public DepartmentDTO(int departmentID, String name, Double budget, LocalDateTime startDate){
        this.departmentID = departmentID;
        this.name = name;
        this.budget = budget;
        this.startDate = startDate;
    }
    public int getDepartmentID() {
        return departmentID;
    }
    public void setDepartmentID(int departmentID) {
        this.departmentID = departmentID;
    }
    public String getName() {
        return name;
    }
    public void setName(String name) {
        this.name = name;
    }
    public Double getBudget() {
        return budget;
    }
    public void setBudget(Double budget) {
        this.budget = budget;
    }
    public LocalDateTime getStartDate() {
        return startDate;
    }
    public void setStartDate(LocalDateTime startDate) {
        this.startDate = startDate;
    }
}
