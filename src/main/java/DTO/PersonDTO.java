package DTO;


public abstract class PersonDTO {
    private int ID;
    private String lastName;
    private String firstName;

    public PersonDTO(){}

    public PersonDTO(int ID, String lastName, String firstName){
        this.ID = ID;
        this.lastName = lastName;
        this.firstName = firstName;
    }

    public int getID() {
        return ID;
    }

    public void setID(int ID) {
        this.ID = ID;
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

}
