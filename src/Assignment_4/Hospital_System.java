package Assignment_4;

import java.util.Scanner;


interface Service {
    void serviceDetails();  // Abstract method
}



abstract class Person {

    private int id;
    private String name;

    // Constructor - initializes id and name
    Person(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // Getter Methods - Encapsulation
    public int getId() { return id; }
    public String getName() { return name; }

    // Setter Methods - Encapsulation
    public void setId(int id) { this.id = id; }
    public void setName(String name) { this.name = name; }

    abstract void display();
}



class Patient extends Person {


    Patient(int patientId, String patientName) {
        super(patientId, patientName);  // Calling Parent Constructor
    }


    @Override
    void display() {
        System.out.println("\nPatient ID   : " + getId());
        System.out.println("Patient Name : " + getName());
    }


    void displayPatient() {
        display();
    }
}


class Doctor extends Person {

    private String specialization;


    Doctor(int doctorId, String doctorName, String specialization) {
        super(doctorId, doctorName);  // Calling Parent Constructor
        this.specialization = specialization;
    }


    public String getSpecialization() { return specialization; }
    public void setSpecialization(String specialization) { this.specialization = specialization; }


    @Override
    void display() {
        System.out.println("\nDoctor ID       : " + getId());
        System.out.println("Doctor Name     : " + getName());
        System.out.println("Specialization  : " + specialization);
    }


    void displayDoctor() {
        display();
    }
}



class Appointment {

    // Encapsulation - private fields
    private int appointmentId;
    private Patient patient;
    private Doctor doctor;
    private String date;


    Appointment(int appointmentId, Patient patient, Doctor doctor, String date) {
        this.appointmentId = appointmentId;
        this.patient = patient;
        this.doctor = doctor;
        this.date = date;
    }


    public int getAppointmentId() { return appointmentId; }
    public Patient getPatient() { return patient; }
    public Doctor getDoctor() { return doctor; }
    public String getDate() { return date; }


    void displayAppointment() {
        System.out.println("\nAppointment ID : " + appointmentId);
        System.out.println("Patient Name   : " + patient.getName());
        System.out.println("Doctor Name    : " + doctor.getName());
        System.out.println("Date           : " + date);
    }
}


class Bill {

    private int billId;
    private Patient patient;
    private double amount;
    private double medicineAmount;


    Bill(int billId, Patient patient, double amount) {
        this.billId = billId;
        this.patient = patient;
        this.amount = amount;
        this.medicineAmount = 0;
    }


    Bill(int billId, Patient patient, double amount, double medicineAmount) {
        this.billId = billId;
        this.patient = patient;
        this.amount = amount;
        this.medicineAmount = medicineAmount;
    }


    public int getBillId() { return billId; }
    public double getAmount() { return amount; }
    public double getMedicineAmount() { return medicineAmount; }


    void generateBill() {
        double totalAmount = amount + medicineAmount;
        System.out.println("\n========== BILL ==========");
        System.out.println("Bill ID          : " + billId);
        System.out.println("Patient Name     : " + patient.getName());
        System.out.println("Consultation Fee : Rs." + amount);
        if (medicineAmount > 0) {
            System.out.println("Medicine Amount  : Rs." + medicineAmount);
        }
        System.out.println("--------------------------");
        System.out.println("Total Amount     : Rs." + totalAmount);
        System.out.println("==========================");
    }
}



class Pharmacy implements Service {


    @Override
    public void serviceDetails() {
        System.out.println("\nPharmacy Service Available");
        System.out.println("Medicines Provided Successfully");
    }
}


class Lab implements Service {


    @Override
    public void serviceDetails() {
        System.out.println("\nLab Test Booked Successfully");
        System.out.println("Lab Test Status : In Progress");
    }
}


public class Hospital_System {

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        // Object references - initially null
        Patient patient = null;
        Doctor doctor = null;
        Appointment appointment = null;

        int choice;

        do {
            // Display Menu
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

            choice = sc.nextInt();
            System.out.println("--------------------------------");

            switch (choice) {

                case 1:

                    System.out.print("Enter Patient ID: ");
                    int pid = sc.nextInt();
                    sc.nextLine();

                    System.out.print("Enter Patient Name: ");
                    String pname = sc.nextLine();

                    patient = new Patient(pid, pname);
                    System.out.println("Patient Registered Successfully!");
                    break;

                case 2:

                    if (patient != null)
                        patient.displayPatient();
                    else
                        System.out.println("No Patient Record Found!");
                    break;

                case 3:

                    System.out.print("Enter Doctor ID: ");
                    int did = sc.nextInt();
                    sc.nextLine(); //

                    System.out.print("Enter Doctor Name: ");
                    String dname = sc.nextLine();

                    System.out.print("Enter Specialization: ");
                    String spec = sc.nextLine();

                    doctor = new Doctor(did, dname, spec);
                    System.out.println("Doctor Details Added!");
                    break;

                case 4:

                    if (doctor != null)
                        doctor.displayDoctor();
                    else
                        System.out.println("No Doctor Record Found!");
                    break;

                case 5:

                    if (patient != null && doctor != null) {

                        System.out.print("Enter Appointment ID: ");
                        int aid = sc.nextInt();
                        sc.nextLine();

                        System.out.print("Enter Appointment Date (DD/MM/YYYY): ");
                        String date = sc.nextLine();

                        appointment = new Appointment(aid, patient, doctor, date);
                        System.out.println("Appointment Created Successfully!");

                    } else {
                        System.out.println("Please Add Patient and Doctor First!");
                    }
                    break;

                case 6:

                    if (patient != null) {

                        System.out.print("Enter Bill ID: ");
                        int bid = sc.nextInt();

                        System.out.print("Enter Consultation Fee: ");
                        double amount = sc.nextDouble();


                        Bill bill = new Bill(bid, patient, amount);
                        bill.generateBill();
                        System.out.println("Total Hospital Bill: " + amount);

                    } else {
                        System.out.println("Patient Record Not Found!");
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

                        System.out.print("Enter Bill ID: ");
                        int bid = sc.nextInt();

                        System.out.print("Enter Medicine Bill Amount: ");
                        double medicineAmount = sc.nextDouble();


                        Service pharmacy = new Pharmacy();
                        pharmacy.serviceDetails();


                        Bill medicineBill = new Bill(bid, patient, 0, medicineAmount);
                        System.out.println("Medicine Bill Added Successfully");
                        System.out.println("Medicine Amount: Rs." + medicineAmount);

                    } else {
                        System.out.println("Patient Record Not Found!");
                    }
                    break;

                case 9:

                    Service lab = new Lab();
                    lab.serviceDetails();
                    break;

                case 10:
                    // Exit
                    System.out.println("Thank You ...");
                    System.out.println("Thank you for using Hospital Management System!");
                    break;

                default:
                    System.out.println("Wrong Choice Please Try Again! Please enter between 1-10.");
            }

            System.out.println("--------------------------------");

        } while (choice != 10);

        sc.close(); // Close Scanner
    }
}



