public class SecurityTest {
    public static void main(String[] args) {
        BankAccount account = new BankAccount("123456789", 5000.0);
        
        if (account instanceof SensitiveData) {
            System.out.println("This data needs encryption");
            System.out.println(account);
        }
    }
}