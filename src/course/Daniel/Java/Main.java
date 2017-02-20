package course.Daniel.Java;

import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Date;

public class Main {

    public static void main(String[] args) {
//        String name = "Moshe"; //new String ("Moshe")

	// write your code here
//        Date today = new Date();
//        System.out.println(today);
        // instantiate a student:
        Student moshe = new Student("Moshe", "Doe", "03242434324", "0542352532",
                "moshe.doe@gmail.com","432hashmonaim");

        // This is an array of Students:
//        Student [] arr = new Student[3];
//        for (int i = 0; i < arr.length; i++) {
//            arr[i] = new Student();
//        }

        // This is a list of Students:
        //init the list:
        ArrayList<Student> studatList = new ArrayList<>();

        //add an item to the list:
        studatList.add(moshe);
        studatList.add(new Student());

        //get item from the list:
        //get an item by index
        studatList.get(0);

        //Whats the size of the list:
        int sizeOfList = studatList.size();

        for (int i = 0; i < studatList.size(); i++) {
            Student s = studatList.get(i);
            s.print();


        }

        for (Student temp : studatList) {


        }

        //Remove an item from the list
        studatList.remove(moshe);
        studatList.remove(1);



//        // use the Students methods:
//        moshe.print();
//
//        //instantiate a date:
//        Date now = new Date();
//
//        // use the Date:
//        String dateString = now.toString();

    }
}
