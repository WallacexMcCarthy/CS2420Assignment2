package assign02;

import java.util.TreeMap;

public class PatientIndex {
    private TreeMap<UHealthID, String> patientMap;
    PatientIndex(){
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
