package com.student.manage;
import java.util.Scanner;

public class StudentManagement {

    public static void main(String[] args) {
        System.out.println("Welcome to Student Management App");

        System.out.println("Press 1 to Add Student");
        System.out.println("Press 2 to Remove Student");
        System.out.println("Press 3 to Display Students");
        System.out.println("Press 4 for Updating Student");


        Scanner scan = new Scanner(System.in);
        int userInput = scan.nextInt();

        if(userInput==1)
        {

            int student_id= 3;
            String name= "Mridul Sharma";
            int age = 23;
            String phone = "8341991740";
            int Standard = 12;

            Student student = new Student(student_id, name, age, phone,Standard);
            boolean status = student.addStudentToDB(student);
            if(status)
            {
                System.out.println("Student added Successfully");
            }
            else {
                System.out.println("Something went wrong.");
            }

        }
        else if(userInput==2)
        {
             int student_id= 3;
             Student st = new Student(student_id);
             boolean status = st.deleteStudentFromDB(st);

             if(status)
                 System.out.println("Student's data deleted successfully");
             else
                 System.out.println("something went wrong");

        }
        else if(userInput==3)
        {
            Student student = new Student();
            student.displayDataOfStudents();

        }
        else if(userInput==4)
        {
            int student_id = 2;
            String name ="chotu";
            int age= 19;
            String phone ="7014401313";
            int Standard =11;

            Student st = new Student(student_id,name,age,phone,Standard);
            boolean status = st.updateStudentData(st);
            if(status)
            {
                System.out.println("Data Updated Successfully");
            }
            else
                System.out.println("something went wrong");


        }



    }

}

