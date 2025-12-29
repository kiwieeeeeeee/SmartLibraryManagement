package library;

public class Admin extends User {

    public Admin(String name) {
        super(name);
    }

    @Override
    public void showMenu() {
        System.out.println("ADMIN MENU");
        System.out.println("1. Add Book");
        System.out.println("2. View Books");
        System.out.println("3. Exit");
    }
}

