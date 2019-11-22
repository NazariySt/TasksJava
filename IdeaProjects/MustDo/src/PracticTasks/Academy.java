package PracticTasks;

import java.util.ArrayList;
import java.util.List;

public class Academy {

    Student student1 = new Student("LNU", "Nazik");
    Worker worker1 = new Worker("zavod", "yura");
    List<Person> personList = new ArrayList<Person>();

    public void addPerson(Person person) {
        personList.add(person);

    }

    public void showAll() {
        for (Person p : personList)
            p.showData();

    }


}
