public class Patient {
    private String patientName;
    private int patientId;
    private int entryDate;
    private static int doctorId;
    public Patient(String patientName, int patientId, int entryDate) {
        this.patientName = patientName;
        this.patientId = patientId;
        this.entryDate = entryDate;
        this.doctorId = 0;
    }
    Patient (Patient c){
        this.patientName = c.patientName;
        this.patientId = c.patientId;
        this.entryDate = c.entryDate;
        this.doctorId = c.doctorId;
    }
    public void setPatientName(String patientName) {
        this.patientName = patientName;
    }
    public void setPatientId(int patientId) {
        this.patientId = patientId;
    }

    public void setEntryDate(int entryDate) {
        this.entryDate = entryDate;
    }

    public void setDoctor(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getPatientName() {
        return patientName;
    }

    public int getPatientId() {
        return patientId;
    }

    public int getDoctor() {
        return doctorId;
    }

    public int getEntryDate() {
        return entryDate;
    }
    public String toString() {
        return "name "+ patientName +" id "+ patientId +" date "+ entryDate +" doctors id "+ doctorId;
    }
    public boolean equals(Patient c) {
        return patientName==c.patientName&&patientId==c.patientId&&entryDate==c.entryDate&&doctorId==c.doctorId;
    }
}
