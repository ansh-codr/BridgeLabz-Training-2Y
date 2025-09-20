// Hybrid Inheritance Sample 1: Restaurant Management with interfaces

interface Worker {
    void performDuties();
}

class PersonBase {
    private String name;
    private int id;

    public PersonBase(String name, int id) {
        this.name = name;
        this.id = id;
    }

    public String getName() { return name; }
    public int getId() { return id; }
}

class Chef extends PersonBase implements Worker {
    public Chef(String name, int id) { super(name, id); }

    @Override
    public void performDuties() {
        System.out.println("Chef " + getName() + " (" + getId() + ") cooks dishes and manages the kitchen.");
    }
}

class Waiter extends PersonBase implements Worker {
    public Waiter(String name, int id) { super(name, id); }

    @Override
    public void performDuties() {
        System.out.println("Waiter " + getName() + " (" + getId() + ") serves customers and takes orders.");
    }
}

public class RestaurantHybridMain {
    public static void main(String[] args) {
        Worker[] staff = new Worker[] {
            new Chef("Rohit", 201),
            new Waiter("Meera", 301)
        };
        for (Worker w : staff) {
            w.performDuties();
        }
    }
}
