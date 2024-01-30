package DAL.IDAL;

import java.util.List;
import DTO.CourseDTO;

public interface ICourseDAL {
    public List<CourseDTO> getAllCourses();
    public List<CourseDTO> getCoursesByTitle(String title);
}
