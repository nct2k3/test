package DAL.IDAL;

import DTO.InstructorDTO;

public interface IInstructorDAL {
    public int insertInstructor(InstructorDTO instructorDTO);
    public int removeInstructor(InstructorDTO instructorDTO);
}
