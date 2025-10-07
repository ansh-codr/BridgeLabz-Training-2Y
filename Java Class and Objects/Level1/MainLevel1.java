// Runner for Level 1 programs
public class MainLevel1 {
    public static void main(String[] args) {
        // Employee
        Employee e = new Employee("Aarav", 1001, 75000);
        e.displayDetails();

        System.out.println();
        // Circle
        Circle c = new Circle(3.5);
        c.displayDetails();

        System.out.println();
        // Item
        Item item = new Item("I-101", "Notebook", 49.5);
        item.displayDetails(5);

        System.out.println();
        // MobilePhone
        MobilePhone m = new MobilePhone("Samsung", "S21", 64999);
        m.displayDetails();
    }
}