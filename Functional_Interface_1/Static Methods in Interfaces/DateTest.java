public class DateTest {
    public static void main(String[] args) {
        int day = 15;
        int month = 10;
        int year = 2024;
        
        String date1 = DateFormatter.formatDate(day, month, year);
        String date2 = DateFormatter.formatDateUS(day, month, year);
        
        System.out.println("Regular format: " + date1);
        System.out.println("US format: " + date2);
    }
}