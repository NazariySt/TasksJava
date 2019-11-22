package PracticTasks;

public class Main {

    public static void main(String[] args) {
        Academy academy = new Academy();
        Student student1 = new Student("LNU","Nazik");
        Worker worker1 = new Worker("zavod", "yura");
        academy.addPerson(student1);
        academy.addPerson(worker1);
        academy.showAll();
    }
}
