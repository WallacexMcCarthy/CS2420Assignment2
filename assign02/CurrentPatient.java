package assign02;

import java.util.GregorianCalendar;

public class CurrentPatient extends Patient{
    // TEst
    private int physicianID;
    private GregorianCalendar lastVisit;
    /**
     * Creates a patient with a given name and ID.
     *
     * @param firstName
     * @param lastName
     * @param uHealthID
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
