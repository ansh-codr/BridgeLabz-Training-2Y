public class BackupTest {
    public static void main(String[] args) {
        UserData user = new UserData("John", "john@email.com");
        
        if (user instanceof Backupable) {
            System.out.println("User data can be backed up");
            System.out.println(user);
        }
    }
}