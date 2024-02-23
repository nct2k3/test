package sql;

import java.util.Date;

public class PersonDTO {
    private String personID;
    private String lastName;
    private String firstName;
    private Date hireDate;
    private Date enrollmentDate;

    // Constructors, getters, and setters
    public PersonDTO() {
    }

    public PersonDTO(String personID, String lastName, String firstName, Date hireDate, Date enrollmentDate) {
        this.personID = personID;
        this.lastName = lastName;
        this.firstName = firstName;
        this.hireDate = hireDate;
        this.enrollmentDate = enrollmentDate;
    }

    public String getPersonID() {
        return personID;
    }

    public void setPersonID(String personID) {
        this.personID = personID;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public Date getHireDate() {
        return hireDate;
    }

    public void setHireDate(Date hireDate) {
        this.hireDate = hireDate;
    }

    public Date getEnrollmentDate() {
        return enrollmentDate;
    }

    public void setEnrollmentDate(Date enrollmentDate) {
        this.enrollmentDate = enrollmentDate;
    }

    // Example usage:
    public static void main(String[] args) {
        PersonDTO person = new PersonDTO();
        person.setPersonID("99");
        person.setLastName("Smith");
        person.setFirstName("John");
        person.setHireDate(new Date());
        person.setEnrollmentDate(new Date());

        PersonDAL.insertPerson(person);
    }
}