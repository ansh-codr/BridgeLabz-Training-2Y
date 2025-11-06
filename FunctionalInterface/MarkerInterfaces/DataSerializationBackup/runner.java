package FunctionalInterface.MarkerInterfaces.DataSerializationBackup;

public class runner {
    public static void main(String[] a) {
        data d = new data(1);
        if (d instanceof java.io.Serializable) System.out.println("save"); else System.out.println("skip");
    }
}
