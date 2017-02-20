package course.Daniel.Java;

/**
 * Created by Jakars on 10/02/2017.
 */
public class Person {
    String firstName;
    String lastName;

    public Person(String firstName, String lastName) {
        this.firstName = firstName;
        this.lastName = lastName;
    }

    void printName (){

        System.out.println(firstName + " " + lastName);
    }
}
