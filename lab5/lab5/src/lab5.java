public class lab5 {
    public static void main(String[] args) {
        Hospital hospital = new Hospital("medipol", 3, 3);
        Patient p1 = new Patient("ege", 123, 1 );
        Patient p2 = new Patient("efe", 321, 2);
        Patient p3 = new Patient(p1);
        hospital.addPatient(p1);
        hospital.addPatient(p2);
        hospital.addPatient(p3);

        Doctor d1 = new Doctor("mehmet", 12, "dentist");
        Doctor d2 = new Doctor("ahmet", 21, "cardiolog");
        hospital.addDoctor(d1);
        hospital.addDoctor(d2);

        hospital.addPatientstoDoctor(321,12);

        System.out.println(hospital);
        System.out.println(hospital.findDoctor(12));
        d1.assignPatient(p1);
        System.out.println(d1);

        System.out.println(hospital.findPatient(321));
        System.out.println(p1);
        d1.removePatient(123);
        System.out.println(d1);
        System.out.println("p1 equals p3 " + p1.equals(p3));
    }
}