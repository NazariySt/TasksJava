package PracticTasks;

public class Student extends Person {
    public String education;


    public Student(String education, String name) {
        this.education = education;
        super.name = name;

    }

    @Override
    public void showData() {
        System.out.println(education + "" + name);
    }
}
