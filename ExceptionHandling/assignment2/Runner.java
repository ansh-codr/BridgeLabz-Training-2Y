package assignment2;

public class Runner {
    public static void main(String[] args) {
        String[] grades = {"90", "A+", "85", "78", "B-", "92"};
        for (String grade : grades) {
            try {
                int numericGrade = Integer.parseInt(grade);
                System.out.println("Grade: " + numericGrade);
            } catch (NumberFormatException e) {
                System.out.println("Invalid grade input: " + grade);
            }
        }
    }
}
