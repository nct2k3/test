package sql;

import java.sql.Connection;
import java.sql.Date;
import java.sql.PreparedStatement;
import java.sql.SQLException;

public class PersonDAL {
    public static void insertPerson(PersonDTO person) {
        String sql = "INSERT INTO person(PersonID, Lastname, Firstname, HireDate, EnrollmentDate) VALUES (?, ?, ?, ?, ?)";

        try (Connection conn = Connect.getConnection();
             PreparedStatement statement = conn.prepareStatement(sql)) {
            statement.setString(1, person.getPersonID());
            statement.setString(2, person.getLastName());
            statement.setString(3, person.getFirstName());
            statement.setDate(4, new Date(person.getHireDate().getTime()));
            statement.setDate(5, new Date(person.getEnrollmentDate().getTime()));

            int rowsInserted = statement.executeUpdate();
            if (rowsInserted > 0) {
                System.out.println("A new person was inserted successfully.");
            } else {
                System.out.println("Failed to insert the person.");
            }
        } catch (SQLException e) {
            e.printStackTrace();
        }
    }
}