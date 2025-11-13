package assignment12;

import java.io.IOException;

public class Runner {
    public static void main(String[] args) {
        OnlineExamSystem exam = new OnlineExamSystem();
        try {
            exam.submitExam("S123");
        } catch (InvalidStudentException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } catch (IOException e) {
            System.out.println("Exception caught: " + e.getMessage());
        } finally {
            System.out.println("Exam submission process completed.");
        }
    }
}
