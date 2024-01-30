package DTO;

import java.time.LocalDateTime;

public class LecturerDTO extends PersonDTO {
    
    private LocalDateTime hireDate;

    public LecturerDTO(){}

    public LecturerDTO(int studentID, String lastName, String firstName, LocalDateTime hireDate){
        super(studentID, lastName, firstName);
        this.hireDate = hireDate;
    }

    public LocalDateTime gethireDate() {
        return hireDate;
    }

    public void sethireDate(LocalDateTime hireDate) {
        this.hireDate = hireDate;
    }
}
