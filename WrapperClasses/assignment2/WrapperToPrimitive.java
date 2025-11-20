package assignment2;

public class WrapperToPrimitive {
    public static void main(String[] args) {
        Double value = 45.67;
        double asDouble = value;
        int asInt = (int) asDouble;
        System.out.println(asDouble);
        System.out.println(asInt);
    }
}
