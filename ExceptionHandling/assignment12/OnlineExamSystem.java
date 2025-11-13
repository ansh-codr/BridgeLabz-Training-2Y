package assignment12;

import java.io.IOException;

public class OnlineExamSystem {
    public void validateStudent(String studentId) throws InvalidStudentException {
        if (!studentId.equals("S123")) {
            throw new InvalidStudentException("Invalid student ID");
        }
    }

    public void submitExam(String studentId) throws InvalidStudentException, IOException {
        validateStudent(studentId);
        if (Math.random() < 0.5) {
            throw new IOException("Network error during submission");
        }
        System.out.println("Exam submitted successfully");
    }
}
