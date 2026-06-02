package Assignment_4;

import java.util.Scanner;

// Interface
interface Service {
    void serviceDetails();
}

// Abstract Class
abstract class Person {

    int personId;
    String personName;

    Person(int personId, String personName) {
        this.personId = personId;
        this.personName = personName;
    }

    public int getPersonId() { return personId; }
    public String getPersonName() { return personName; }

    abstract void show();
}

// Patient Class - Inheritance
class Patient extends Person {

    Patient(int personId, String personName) {
        super(personId, personName);
    }

    @Override
    void show() {
        System.out.println("\nPatient ID   : " + personId);
        System.out.println("Patient Name : " + personName);
    }

    void displayPatient() {
        show();
    }
}

// Doctor Class - Inheritance
class Doctor extends Person {

    String department;

    Doctor(int personId, String personName, String department) {
        super(personId, personName);
        this.department = department;
    }

    @Override
    void show() {
        System.out.println("\nDoctor ID      : " + personId);
        System.out.println("Doctor Name    : " + personName);
        System.out.println("Department     : " + department);
    }

    void displayDoctor() {
        show();
    }
}

// Appointment Class
class Appointment {

    int appointID;
    Patient patient;
    Doctor doctor;
    String visitDate;

    Appointment(int appointID, Patient patient, Doctor doctor, String visitDate) {
        this.appointID = appointID;
        this.patient = patient;
        this.doctor = doctor;
        this.visitDate = visitDate;
    }

    void displayAppointment() {
        System.out.println("\nAppointment ID : " + appointID);
        System.out.println("Patient Name   : " + patient.getPersonName());
        System.out.println("Doctor Name    : " + doctor.getPersonName());
        System.out.println("Visit Date     : " + visitDate);
    }
}

// Bill Class - Method Overloading
class Bill {

    int invoiceId;
    Patient patient;
    double fees;
    double medFees;

    // Constructor 1 - Method Overloading
    Bill(int invoiceId, Patient patient, double fees) {
        this.invoiceId = invoiceId;
        this.patient = patient;
        this.fees = fees;
        this.medFees = 0;
    }

    // Constructor 2 - Method Overloading
    Bill(int invoiceId, Patient patient, double fees, double medFees) {
        this.invoiceId = invoiceId;
        this.patient = patient;
        this.fees = fees;
        this.medFees = medFees;
    }

    void generateBill() {
        double totalFees = fees + medFees;
        System.out.println("\n========== INVOICE ==========");
        System.out.println("Invoice ID       : " + invoiceId);
        System.out.println("Patient Name     : " + patient.getPersonName());
        System.out.println("Doctor Fees      : Rs." + fees);
        if (medFees > 0) {
            System.out.println("Medicine Fees    : Rs." + medFees);
        }
        System.out.println("-----------------------------");
        System.out.println("Total Fees       : Rs." + totalFees);
        System.out.println("=============================");
    }
}

// Pharmacy Class - Implements Interface
class Pharmacy implements Service {

    @Override
    public void serviceDetails() {
        System.out.println("\nPharmacy Counter Ready");
        System.out.println("Medicines Provided Successfully");
    }
}

// Lab Class - Implements Interface
class Lab implements Service {

    @Override
    public void serviceDetails() {
        System.out.println("\nLab Test Booked Successfully");
        System.out.println("Lab Test Status : Processing");
    }
}

// Main Class
public class Hospital_System {

    public static void main(String[] args) {

        Scanner myScanner = new Scanner(System.in);

        Patient patient = null;
        Doctor doctor = null;
        Appointment appointment = null;

        int choice;

        do {
            System.out.println("\n===== HOSPITAL MANAGEMENT SYSTEM =====");
            System.out.println("1.  Add Patient");
            System.out.println("2.  View Patient");
            System.out.println("3.  Add Doctor");
            System.out.println("4.  View Doctor");
            System.out.println("5.  Book Appointment");
            System.out.println("6.  Generate Bill");
            System.out.println("7.  Consultation Status");
            System.out.println("8.  Pharmacy Service");
            System.out.println("9.  Lab Test Service");
            System.out.println("10. Exit");
            System.out.println("=======================================");
            System.out.print("Enter Choice: ");

            choice = myScanner.nextInt();
            System.out.println("--------------------------------");

            switch (choice) {

                case 1:
                    System.out.print("Patient ID Number: ");
                    int patientID = myScanner.nextInt();
                    myScanner.nextLine();
                    System.out.print("Patient Full Name: ");
                    String patientName = myScanner.nextLine();
                    patient = new Patient(patientID, patientName);
                    System.out.println("Patient Registered Successfully!");
                    break;

                case 2:
                    if (patient != null)
                        patient.displayPatient();
                    else
                        System.out.println("Patient Not Found!");
                    break;

                case 3:
                    System.out.print("Doctor ID Number: ");
                    int doctorID = myScanner.nextInt();
                    myScanner.nextLine();
                    System.out.print("Doctor Full Name: ");
                    String doctorName = myScanner.nextLine();
                    System.out.print("Enter Department: ");
                    String dept = myScanner.nextLine();
                    doctor = new Doctor(doctorID, doctorName, dept);
                    System.out.println("Doctor Registered Successfully!");
                    break;

                case 4:
                    if (doctor != null)
                        doctor.displayDoctor();
                    else
                        System.out.println("Doctor Not Found!");
                    break;

                case 5:
                    if (patient != null && doctor != null) {
                        System.out.print("Appointment ID: ");
                        int appointID = myScanner.nextInt();
                        myScanner.nextLine();
                        System.out.print("Visit Date (DD/MM/YYYY): ");
                        String visitDate = myScanner.nextLine();
                        appointment = new Appointment(appointID, patient, doctor, visitDate);
                        System.out.println("Appointment Confirmed Successfully!");
                    } else {
                        System.out.println("Add Patient and Doctor First!");
                    }
                    break;

                case 6:
                    if (patient != null) {
                        System.out.print("Invoice ID: ");
                        int invoiceId = myScanner.nextInt();
                        System.out.print("Enter Doctor Fees: ");
                        double fees = myScanner.nextDouble();
                        Bill bill = new Bill(invoiceId, patient, fees);
                        bill.generateBill();
                    } else {
                        System.out.println("Patient Not Found!");
                    }
                    break;

                case 7:
                    if (appointment != null) {
                        System.out.println("\nConsultation Completed Successfully");
                        appointment.displayAppointment();
                    } else {
                        System.out.println("No Appointment Found!");
                    }
                    break;

                case 8:
                    if (patient != null) {
                        System.out.print("Invoice ID: ");
                        int invoiceId = myScanner.nextInt();
                        System.out.print("Medicine Fees: ");
                        double medFees = myScanner.nextDouble();
                        Service pharmacy = new Pharmacy();
                        pharmacy.serviceDetails();
                        Bill medicineBill = new Bill(invoiceId, patient, 0, medFees);
                        System.out.println("Medicine Bill Added!");
                        System.out.println("Medicine Fees: Rs." + medFees);
                    } else {
                        System.out.println("Patient Not Found!");
                    }
                    break;

                case 9:
                    Service lab = new Lab();
                    lab.serviceDetails();
                    break;

                case 10:
                    System.out.println("Goodbye! Stay Healthy!");
                    break;

                default:
                    System.out.println("Wrong Choice! Enter 1 to 10 only!");
            }

            System.out.println("--------------------------------");

        } while (choice != 10);

        myScanner.close();
    }
}
