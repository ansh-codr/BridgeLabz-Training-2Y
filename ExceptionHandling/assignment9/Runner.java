package assignment9;

import java.time.LocalDateTime;

public class Runner {
    public static void main(String[] args) {
        OnlineExam exam = new OnlineExam();
        try {
            exam.submitExam("exam.pdf", LocalDateTime.now());
        } catch (LateSubmissionException e) {
            System.out.println(e.getMessage());
        } catch (InvalidFileFormatException e) {
            System.out.println(e.getMessage());
        }
    }
}
