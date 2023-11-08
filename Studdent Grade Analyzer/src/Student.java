public class Student {

    private String name;
    private int grade;
    private String course;

    public void setName(String name){
        this.name = name;
    }

    public String getName(){
        return this.name;
    }

    public void setGrade(int grade){
        this.grade = grade;
    }

    public int getGrade(){
        return this.grade;
    }

    public void setCourse(String course){
        this.course = course;
    }

    public String getCourse(){
        return this.course;
    }

    public Student(String name,int grade,String course){
        this.name=name;
        this.grade=grade;
        this.course=course;
    }

}

