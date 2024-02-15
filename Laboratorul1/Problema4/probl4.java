package Problema4;

public class probl4 {
    public static void main(String[] args) {
        Person person = new Person("John", 30);

        person.displayInfo();
        person.setName("Alice");
        person.setAge(25);

        person.displayInfo();
    }
}
