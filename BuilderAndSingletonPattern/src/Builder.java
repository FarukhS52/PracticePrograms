public class Builder {

    private final int student_id;
    private final String name;
    private final int age;
    private final String phone;
    private final int Standard;

    private Builder(UserBuilder userBuilder){
        this.student_id=userBuilder.student_id;
        this.name= userBuilder.name;
        this.age= userBuilder.age;
        this.phone= userBuilder.phone;
        this.Standard= userBuilder.Standard;
    }

    public int getStudent_id(){
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
    @Override
    public String toString(){
        return student_id +" : "+ name+" : "+age+" : "+phone+" : "+Standard;
    }

    static class UserBuilder{
        private int student_id;
        private String name;
        private int age;
        private String phone;
        private int Standard;
        public UserBuilder(){}


        public UserBuilder setStudent_id(int student_id){
            this.student_id=student_id;
            return this;
        }

        public UserBuilder setName(String name) {
            this.name = name;
            return this;
        }

        public UserBuilder setAge(int age) {
            this.age = age;
            return this;
        }

        public UserBuilder setPhone(String phone) {
            this.phone = phone;
            return this;
        }

        public UserBuilder setStandard(int standard) {
            Standard = standard;
            return this;
        }

        public Builder build(){
            return new Builder(this);

        }
    }
}
