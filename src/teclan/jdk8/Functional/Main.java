package teclan.jdk8.Functional;

import java.util.ArrayList;

public class Main {

    public static void main(String[] args) {

        ArrayList<Student> students = new ArrayList<Student>();

        for (int i = 0; i < 5; i++) {

            students.add(new Student(i, "student_" + i));
        }

        MyInterface myInterface = (o) -> {
            o.toString();
        };

        for (Student stu : students) {
            myInterface.display(stu);

        }

        System.out.println("\n ============== 华丽的分隔线 =============== \n");

        myInterface = (o) -> {
            System.out.println("当前id : " + o.getId());
        };

        for (Student stu : students) {
            myInterface.display(stu);

        }
    }

}
