package library;

public class Student extends User {

    public Student(String name) {
        super(name);
    }

    @Override
    public void showMenu() {
        System.out.println("STUDENT MENU");
        System.out.println("1. Issue Book");
        System.out.println("2. Return Book");
        System.out.println("3. Exit");
    }
}

