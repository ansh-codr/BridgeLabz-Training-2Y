public interface DateFormatter {
    
    static String formatDate(int day, int month, int year) {
        return day + "/" + month + "/" + year;
    }
    
    static String formatDateUS(int day, int month, int year) {
        return month + "/" + day + "/" + year;
    }
}