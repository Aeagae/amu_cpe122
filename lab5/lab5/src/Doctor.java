public class Doctor {
    private String doctorName;
    private int doctorId;
    private String specialization;
    private Patient[]patients;
    private int noOfPatients;
    private boolean isAvailable;

    public Doctor(String doctorName, int doctorId, String specialization) {
        this.doctorName = doctorName;
        this.doctorId = doctorId;
        this.specialization = specialization;
        this.patients = new Patient[4];
        this.noOfPatients = 0;
        this.isAvailable = true;
    }
    Doctor(Doctor c){
        this.doctorName = c.doctorName;
        this.doctorId = c.doctorId;
        this.specialization = c.specialization;
        this.noOfPatients = c.noOfPatients;
        this.isAvailable = c.isAvailable;
        this.patients = new Patient[4];
        for (int i = 0; i < noOfPatients; i++) {
            this.patients[i] = c.patients[i];
        }
    }

    public String getDoctorName() {
        return doctorName;
    }

    public void setDoctorName(String doctorName) {
        this.doctorName = doctorName;
    }

    public int getDoctorId() {
        return doctorId;
    }

    public void setDoctorId(int doctorId) {
        this.doctorId = doctorId;
    }

    public String getSpecialization() {
        return specialization;
    }

    public void setSpecialization(String specialization) {
        this.specialization = specialization;
    }
    public Patient[] getPatients() {
        return patients;
    }
    public void setPatients(Patient[] patients) {
        this.patients = patients;
    }
    public boolean isAvailable() {
        return isAvailable;
    }
    public int getNoOfPatients() {
        return noOfPatients;
    }
    public  void assignPatient(Patient p) {
        if (noOfPatients<4){
            Patient newPatients = new Patient(p);
            newPatients.setDoctor(this.doctorId);
            patients[noOfPatients]=newPatients;
            noOfPatients++;
        }
        else if (noOfPatients==4){
            isAvailable=false;
        }
        else {
            System.out.println("doctor is full");
        }
    }
    public void removePatient(int patientId) {
        for (int i = 0; i < noOfPatients; i++) {
            if (patients[i].getPatientId()==patientId) {
                for (int j = i; j < noOfPatients - 1; j++) {
                    patients[j] = patients[j + 1];
                }
                patients[noOfPatients - 1] = null;
                noOfPatients--;
                isAvailable = true;
            }
            else
                System.out.println("no patient found");
        }
    }
    public boolean equals(Doctor d) {
        return this.doctorId==d.doctorId;
    }
    public String toString() {
        return doctorName+ " " + doctorId + " " + specialization+ " " + noOfPatients + " " + isAvailable;
    }



}
