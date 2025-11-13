package assignment15;

public class NestedTryCatch {
    public void methodB() {
        try {
            String str = null;
            str.length();
        } catch (NumberFormatException e) {
            System.out.println("NumberFormatException caught in methodB");
        }
    }

    public void methodA() {
        try {
            methodB();
        } catch (NullPointerException e) {
            System.out.println("NullPointerException caught in methodA: " + e.getMessage());
        }
    }
}
