public class UserData implements Backupable {
    private String name;
    private String email;
    
    public UserData(String name, String email) {
        this.name = name;
        this.email = email;
    }
    
    public String toString() {
        return "User: " + name + ", Email: " + email;
    }
}