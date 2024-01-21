package assign02;

import java.util.GregorianCalendar;

/**
 * This class represents a current patient of the hospital with specific characteristic values that differ one patient
 * from another.
 * This class inherits Patient as it is just a more specific patient
 * @author Wallace McCarthy (u0838487) and
 * @version Jan 20, 2024
 */

public class CurrentPatient extends Patient{
    private int physicianID;
    private GregorianCalendar lastVisit;
    /**
     * Creates a Current patient with a given name and ID.
     *
     * @param firstName
     * @param lastName
     * @param uHealthID
     * @param physicianID
     * @param lastVisit
     */
    public CurrentPatient(String firstName, String lastName, UHealthID uHealthID, int physicianID, GregorianCalendar lastVisit) {
        super(firstName, lastName, uHealthID);
        this.physicianID = physicianID;
        this.lastVisit = lastVisit;
    }
    public int getPhysician(){
        return this.physicianID;
    }
    public GregorianCalendar getLastVisit(){
        return this.lastVisit;
    }
    public void updatePhysician(int newPhysician){
        this.physicianID = newPhysician;
    }

    public void updateLastVisit(GregorianCalendar date){
        this.lastVisit = date;
    }

}
