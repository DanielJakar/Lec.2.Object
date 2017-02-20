package course.Daniel.Java;
import java.time.LocalDateTime;
import java.time.temporal.ChronoUnit;
import java.util.Date;

/**
 * This is a template, that describes
 * what is a student?
 * what properties?
 * what Actions/Methods? Students have
 */

//cameCase - for properties and mothods
//PascalCase

public class Student {
    //Properties: Variables:
    String firstName;
    String lastName;
    String socialID;
    String phone;
    String email;
    String address;
    LocalDateTime enrollmentDate; // shift + F6 (rename all)


    //Constructor: -
    // A special method that assists us in initializing all the properties:
    //alt + insert

    public Student(String firstName, String lastName, String socialID, String phone, String email, String address) {
        this.firstName = firstName;
        this.lastName = lastName;
        this.socialID = socialID;
        this.phone = phone;
        this.email = email;
        this.address = address;
        this.enrollmentDate = LocalDateTime.now();
    }

    // Empty Constructor:
    //default constructor, if no other constructor exists, the compiler generates a default constructor like this one:

    public Student() {
        this.firstName = IO.getString("Enter your first name:");
        this.lastName = IO.getString("Enter your last name:");
        this.socialID = IO.getString("Enter your Social ID number:");
        this.phone = IO.getString("Enter your phone number:");
        this.email = IO.getString("Enter your email address:");
        this.address = IO.getString("Enter your address (with no gaps):");
        this.enrollmentDate = LocalDateTime.now();
    }


    //Actions: Methods

    //instance method:
    //first create an instance, on the instance we call the method:
    //Student s = new Student;
    //s.sayYourName();
    public void sayYourName (){

        System.out.println(firstName + " " + lastName);
    }

    public void print (){
        System.out.println(toString());
    }

    public String toString() {
        return
                        "First Name: " + firstName + "\n" +
                        "Last Name: " + lastName + "\n" +
                        "Social ID: " + socialID + "\n" +
                        "Enrollment Date: " + enrollmentDate + "\n" +
                        "Emai Address: " + email + "\n" +
                        "Home Address: " + address + "\n" +
                        "Phone:" + phone;
    }
    public void howManySeconds(){
        LocalDateTime now = LocalDateTime.now();
        now.until(enrollmentDate, ChronoUnit.SECONDS);

    }



}
