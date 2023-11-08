import java.util.*;
import java.util.stream.Collectors;

public class StudentGradeAnalyzer {
    public static void main(String[] args){
        List<Student> students = Arrays.asList(new Student("Farookh Siddiqui",89,"Maths"),
                new Student("Farookh Siddiqui",88,"Science"),
                new Student("Farookh Siddiqui",92,"English"),
                new Student("Farookh Siddiqui",83,"Hindi"),
                new Student("Mridul Sharma",94,"Maths"),
                new Student("Mridul Sharma",89,"Science"),
                new Student("Mridul Sharma",85,"English"),
                new Student("Mridul Sharma",95,"Hindi"),
                new Student("Ayaz Chaudhary",89,"Maths"),
                new Student("Ayaz Chaudhary",87,"Science"),
                new Student("Ayaz Chaudhary",98,"English"),
                new Student("Ayaz Chaudhary",92,"Hindi"),
                new Student("Vaibhav Wakde",97,"Maths"),
                new Student("Vaibhav Wakde",78,"Science"),
                new Student("Vaibhav Wakde",68,"English"),
                new Student("Vaibhav Wakde",68,"Hindi")
                );

        Map<String, Double> Average = students.stream().collect(Collectors.groupingBy(Student::getName,Collectors.averagingInt(Student::getGrade)));
        System.out.println(Average);

        students.stream().filter(n-> Objects.equals(n.getCourse(), "Maths")).filter(n->n.getGrade()>=90).map(Student::getName).forEach(System.out::println);
        students.stream().map(Student::getGrade).sorted().forEach(System.out::println);



    }

}
