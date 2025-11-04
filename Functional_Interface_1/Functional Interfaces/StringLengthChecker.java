public class StringLengthChecker {
    static int len(String s) { return s.length(); }

    public static void main(String[] args) {
        String msg1 = "Hello World!";
        String msg2 = "This is a very long message";
        String msg3 = "Hi";

        int length1 = len(msg1);
        int length2 = len(msg2);
        int length3 = len(msg3);

        System.out.println(msg1 + " Length: " + length1);
        System.out.println(msg2 + " Length: " + length2);
        System.out.println(msg3 + " Length: " + length3);

        if (length1 > 20) System.out.println("Message 1 is too long");
        if (length2 > 20) System.out.println("Message 2 is too long");
        if (length3 > 20) System.out.println("Message 3 is too long");
    }
}