package course.Daniel.Java;

import java.util.ArrayList;

/**
 * Created by Jakars on 17/02/2017.
 */
public class StudentPhonebook {
    ArrayList<Student> studentList = new ArrayList<>();

    void addstudent (Student s){
        studentList.add(s);
    }

    void addStudent (){
        Student s = new Student();
        studentList.add(s);
    }

    void removeStudent (int index){
        //TODO: Test for Bounds
        studentList.remove(index);
    }

    void showStudent (int index){
        //TODO: Test for Bounds
        Student s = studentList.get(index);
        s.print();

    }

    void showAllStudents (){
        for (Student s: studentList) {
            s.print();

        }

    }
}
