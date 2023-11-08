package com.student.manage;

import java.sql.*;
import java.util.Map;
import java.util.Properties;
import java.util.concurrent.Executor;

public class Student {
    private int student_id;
    private String name;
    private int age;
    private String phone;
    private int Standard;
    DBconnection DBconnection;

    public Student() {}

    public int getStudent_id() {
        return student_id;
    }
    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public String getPhone() {
        return phone;
    }
    public int getStandard() {
        return Standard;
    }

    public Student(int student_id, String name, int age, String phone, int Standard) {
        this.student_id = student_id;
        this.name = name;
        this.age = age;
        this.phone = phone;
        this.Standard = Standard;
    }
    public Student(int student_id){
        this.student_id = student_id;
    }

    @Override
    public String toString() {
        return "Student [student_id=" + student_id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", Standard="
                + Standard + "]";
    }

    public boolean addStudentToDB(Student student)
    {
        boolean StudentDataAdded=false;
        try
        {
             DBconnection = new DBconnection();
             Connection connection = DBconnection.createConnection();


            String query = "insert into students values(?,?,?,?,?)";

            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1, student.getStudent_id());
            ps.setString(2, student.getName());
            ps.setInt(3, student.getAge());
            ps.setString(4, student.getPhone());
            ps.setInt(5, student.getStandard());

            int updatedColumns = ps.executeUpdate();
            if(updatedColumns>0)
                {StudentDataAdded = true;}


        }
        catch(Exception e) {e.printStackTrace();}

        return StudentDataAdded;

    }

    public  boolean deleteStudentFromDB(Student student)
    {
        boolean StudentDataDeleted  = false;
        try {
            DBconnection = new DBconnection();
            Connection connection = DBconnection.createConnection();

            String query = "delete from students where student_id=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setInt(1,student.getStudent_id());

            ps.executeUpdate();
            StudentDataDeleted = true;
        } catch (Exception e) {
            e.printStackTrace();
        }
        return StudentDataDeleted;

    }

    public  void displayDataOfStudents()
    {
        try {
            DBconnection = new DBconnection();
            Connection connection = DBconnection.createConnection();

            String query = "select * from students";

            PreparedStatement ps = connection.prepareStatement(query);
            ResultSet rs  =ps.executeQuery();

            while(rs.next()){
                int student_id=rs.getInt(1);
                String name=rs.getString(2);
                int age=rs.getInt(3);
                String phone=rs.getString(4);
                int Standard=rs.getInt(5);

                System.out.println("Student [student_id=" + student_id + ", name=" + name + ", age=" + age + ", phone=" + phone + ", Standard="
                        + Standard + "]");

            }
        } catch (SQLException e) {
            throw new RuntimeException(e);
        }

    }

    public boolean updateStudentData(Student student){
        boolean StudentdataUpdated = false;
        try{
            DBconnection = new DBconnection();
            Connection connection = DBconnection.createConnection();

            String query = "update students set name= ?,age=?,phone=?,Class=?  Where student_id=?";
            PreparedStatement ps = connection.prepareStatement(query);
            ps.setString(1, student.getName());
            ps.setInt(2, student.getAge());
            ps.setString(3, student.getPhone());
            ps.setInt(4, student.getStandard());
            ps.setInt(5,student.getStudent_id());
            ps.executeUpdate();
            StudentdataUpdated = true;
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
        return StudentdataUpdated;
    }


}
