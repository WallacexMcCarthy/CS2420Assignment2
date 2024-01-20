package assign02;

import java.util.GregorianCalendar;

public class CurrentPatientGeneric<T> extends Patient{
    private T physicianID;
    private GregorianCalendar lastVisit;
    /**
     * Creates a patient with a given name and ID.
     *
     * @param firstName
     * @param lastName
     * @param uHealthID
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
