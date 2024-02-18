package BUS;

import DAL.IDAL.ILecturerDAL;
import DAL.IDAL.IObjectDAL;
import DAL.OfficeAssignmentDAL;
import DTO.LecturerDTO;
import DTO.OfficeAssignmentDTO;

/**
 *
 * @author ant1006
 */
public class OfficeAssignmentBUS {
    
    private IObjectDAL officeAssignmentDAL;


    public OfficeAssignmentBUS(IObjectDAL officeAssignmentDAL) {
        this.officeAssignmentDAL = officeAssignmentDAL;
    }

    public int createAOfficeAssignment(OfficeAssignmentDTO officeAssignment) {
        OfficeAssignmentDTO officeAssignmentDTO = officeAssignmentDAL.getAnObjectByID(officeAssignment.getInstrutorID());
        
        if (officeAssignmentDTO == null) 
            return ((IObjectDAL) officeAssignmentDAL).insertObject(officeAssignmentDTO);
        
        return 0;
    }

    public int updateAOfficeAssignment(OfficeAssignmentDTO officeAssignment) {
        return ((IObjectDAL) officeAssignmentDAL).updateObject(officeAssignment);
    }

    public int removeAOfficeAssignment(int officeAssignmentID) {
        return ((IObjectDAL) officeAssignmentDAL).removeObject(officeAssignmentID);
    }

    public OfficeAssignmentDTO getAOfficeAssignmentByID(int officeAssignmentID) {
        return ((IObjectDAL) officeAssignmentDAL).getAnObjectByID(officeAssignmentID);
    }
}
