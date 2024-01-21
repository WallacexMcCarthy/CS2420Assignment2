package assign02;

import java.util.TreeMap;

/**
 * Stores patients in a map that maps their uHealthID with their name.
 *
 *
 * @author Wallace McCarthy (u0838487) and
 * @version Jan 20, 2024
 */

public class PatientIndex {
    private TreeMap<UHealthID, String> patientMap;
    public PatientIndex(){
        patientMap = new TreeMap<>((uHealthID1, uHealthID2) -> {return uHealthID1.toString().compareTo(uHealthID2.toString());});
    }

    public void addPatient(Patient p) {
        if(!patientMap.containsKey(p.getUHealthID())) {
            patientMap.put(p.getUHealthID(), p.getFirstName() + " " + p.getLastName());
        }
        else {
            patientMap.replace(p.getUHealthID(), p.getFirstName() + " " + p.getLastName());
        }
    }

    public void removePatient(Patient p) {
        patientMap.remove(p.getUHealthID());
    }

    public String getName(UHealthID id) {
        return patientMap.get(id);
    }
}
