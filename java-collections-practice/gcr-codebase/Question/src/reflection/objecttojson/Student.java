package reflection.objecttojson;

public class Student {
    private String name;
    private int age;
    private double gpa;

    public Student() {} 

    public void show() {
        System.out.println("Name: " + name + ", Age: " + age + ", GPA: " + gpa);
    }
}
