package BUS;

import DAL.IDAL.ICourseDAL;
import DAL.IDAL.IInstructorDAL;
import DAL.IDAL.IObjectDAL;
import DAL.InstructorDAL;
import DTO.InstructorDTO;

/**
 *
 * @author ant1006
 */
public class InstructorBUS {

    private IInstructorDAL instructorDAL;
    private ICourseDAL courseDAL;

    public InstructorBUS() {
        instructorDAL = new InstructorDAL();
    }

    public int createAInstructor(InstructorDTO instructor) {
        // check time conflict course instructor
        // code here
        // ...
        return ((IObjectDAL) instructorDAL).insertObject(instructor);
    }

    public int removeAInstructor(InstructorDTO instructor) {
        return instructorDAL.removeInstructor(instructor);
    }

}
