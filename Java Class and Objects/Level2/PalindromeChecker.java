// Level2 - Program 3: Palindrome Checker
public class PalindromeChecker {
    private String text;

    public PalindromeChecker(String text) {
        this.text = text;
    }

    public boolean isPalindrome() {
        if (text == null) return false;
        String normalized = text.replaceAll("[^A-Za-z0-9]", "").toLowerCase();
        int i = 0, j = normalized.length() - 1;
        while (i < j) {
            if (normalized.charAt(i) != normalized.charAt(j)) return false;
            i++; j--;
        }
        return true;
    }

    public void displayResult() {
        System.out.println("Text: " + text + " | Palindrome? " + isPalindrome());
    }
}