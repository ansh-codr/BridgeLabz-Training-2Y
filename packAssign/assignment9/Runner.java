import com.access.two.Derived;

public class Runner {
    public static void main(String[] args) {
        Derived d = new Derived();
        d.test();
        System.out.println("default no");
        System.out.println("private no");
    }
}
