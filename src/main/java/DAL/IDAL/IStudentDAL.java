package DAL.IDAL;

import java.util.List;

import DTO.CourseDTO;
import DTO.StudentDTO;

public interface IStudentDAL {
    public List<CourseDTO> getAllStudent();
    public List<StudentDTO> getAllStudentsOfACourse(int courseID);
}
