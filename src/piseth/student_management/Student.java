package piseth.student_management;

public class Student {
    public Integer id;
    public String name;
    public Integer age;
    public String gender;

    public Student(){}

    public Student(Integer id, String name, Integer age, String gender){
        this.id = id;
        this.name = name;
        this.age = age;
        this.gender = gender;
    }

    @Override
    public String toString() {
        return "Student{" +
                "id=" + id +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", gender='" + gender + '\'' +
                '}';
    }

}
