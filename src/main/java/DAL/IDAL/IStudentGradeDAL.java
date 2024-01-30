package DAL.IDAL;

import java.util.List;
import DTO.StudentGradeDTO;


public interface IStudentGradeDAL {
    public List<StudentGradeDTO> getStudentGradesOfCCourse(int courseID);
}
