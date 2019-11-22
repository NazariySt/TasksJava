package PracticTasks;

public class Worker extends Person {
    public String workPlace;

    public Worker(String workPlace, String name) {
        this.workPlace = workPlace;
        super.name = name;

    }

    @Override
    public void showData() {
        System.out.println(workPlace + "" + name);
    }
}
