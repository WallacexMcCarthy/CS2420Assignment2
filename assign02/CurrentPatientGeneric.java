package assign02;

import java.util.GregorianCalendar;

/**
 * This class is the generic version of the Current Patient class, having the same functionalities except with having
 * the ability to have an any valued physicianID (The generic part).
 * @param <T> Physician ID
 * @author Wallace McCarthy (u0838487) and
 * @version Jan 20, 2024
 */

public class CurrentPatientGeneric<T> extends Patient{
    private T physicianID;
    private GregorianCalendar lastVisit;
    /**
     * Creates a patient with a given name and ID.
     *
     * @param firstName
     * @param lastName
     * @param uHealthID
     * @param physicianID
     * @param lastVisit
     */
    public CurrentPatientGeneric(String firstName, String lastName, UHealthID uHealthID, T physicianID, GregorianCalendar lastVisit) {
        super(firstName, lastName, uHealthID);
        this.physicianID = physicianID;
        this.lastVisit = lastVisit;
    }
    public T getPhysician(){
        return this.physicianID;
    }
    public GregorianCalendar getLastVisit(){
        return this.lastVisit;
    }
    public void updatePhysician(T newPhysician){
        this.physicianID = newPhysician;
    }

    public void updateLastVisit(GregorianCalendar date){
        this.lastVisit = date;
    }

}
