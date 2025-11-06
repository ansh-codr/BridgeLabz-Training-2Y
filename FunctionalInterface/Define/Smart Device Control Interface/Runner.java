public class Runner {
    public static void main(String[] args) {
        Device d1 = new Light();
        Device d2 = new AC();
        Device d3 = new TV();
        d1.turnOn();
        d1.turnOff();
        d2.turnOn();
        d2.turnOff();
        d3.turnOn();
        d3.turnOff();
    }
}
