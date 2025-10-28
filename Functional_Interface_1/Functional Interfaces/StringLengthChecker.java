import java.util.function.Function;

public class StringLengthChecker {
    
    public static void main(String[] args) {
        Function<String, Integer> getLength = text -> text.length();
        
        String msg1 = "Hello World!";
        String msg2 = "This is a very long message";
        String msg3 = "Hi";
        
        int length1 = getLength.apply(msg1);
        int length2 = getLength.apply(msg2);
        int length3 = getLength.apply(msg3);
        
        System.out.println("Message: " + msg1 + " Length: " + length1);
        System.out.println("Message: " + msg2 + " Length: " + length2);
        System.out.println("Message: " + msg3 + " Length: " + length3);
        
        if (length1 > 20) {
            System.out.println("Message 1 is too long");
        }
        if (length2 > 20) {
            System.out.println("Message 2 is too long");
        }
        if (length3 > 20) {
            System.out.println("Message 3 is too long");
        }
    }
}