public class Hospital {
    private String hospitalName;
    private int numberOfDoctors;
    private int numberOfPatients;
    private Doctor[] doctors;
    private Patient[] patients;
    private int sizeOfPatients;
    private int sizeOfDoctors;

    public Hospital(String hospitalName,int sizeOfDoctors,int sizeOfPatients) {
        this.hospitalName = hospitalName;
        this.sizeOfPatients = sizeOfPatients;
        this.sizeOfDoctors = sizeOfDoctors;
        this.doctors = new Doctor[sizeOfDoctors];
        this.patients = new Patient[sizeOfPatients];
        this.numberOfDoctors = 0;
        this.numberOfPatients = 0;
    }
    Hospital(Hospital h){
        this.hospitalName = h.hospitalName;
        this.numberOfDoctors = h.numberOfDoctors;
        this.numberOfPatients = h.numberOfPatients;
        this.doctors = new Doctor[h.numberOfDoctors];
        this.patients = new Patient[h.numberOfPatients];
        this.sizeOfPatients = h.numberOfPatients;
        this.sizeOfDoctors = h.numberOfDoctors;
    }
    public void addPatient(Patient p){
        if(numberOfPatients < sizeOfPatients){
            Patient newPatients = new Patient(p);
            patients[numberOfPatients] = newPatients;
            numberOfPatients++;
        }
        else{
            System.out.println("The hospital is full of patients");
        }
    }
    public void addDoctor(Doctor d){
        if(numberOfDoctors < sizeOfDoctors){
            Doctor newDoctors = new Doctor(d);
            doctors[numberOfDoctors] = newDoctors;
            numberOfDoctors++;
        }
        else {
            System.out.println("The hospital is full of doctors");
        }
    }
    public void addPatientstoDoctor(int patientId ,int doctorId ){
        Patient patient = findPatient(patientId);
        Doctor doctor = findDoctor(doctorId);
        doctor.assignPatient(patient);
        patient.setDoctor(doctorId);
    }
    public Patient findPatient(int patientId){
        for(int i = 0 ; i < numberOfPatients ; i++){
            if (patientId == patients[i].getPatientId()){
                return new Patient(patients[i]);
            }
        }
        return null;
    }
    public Doctor findDoctor(int doctorId){
        for(int i = 0 ; i < numberOfDoctors ; i++){
            if (doctorId == doctors[i].getDoctorId()){
                return new Doctor(doctors[i]);
            }
        }
        return null;
    }
    public String toString() {
        return "hospname "+hospitalName+" docnum "+numberOfDoctors+" patnum "+numberOfPatients;
    }

}
