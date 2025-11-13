package assignment9;

import java.time.LocalDateTime;

public class OnlineExam {
    private LocalDateTime deadline = LocalDateTime.of(2025, 11, 15, 23, 59);

    public void submitExam(String fileName, LocalDateTime submissionTime) throws LateSubmissionException, InvalidFileFormatException {
        if (!fileName.endsWith(".pdf")) {
            throw new InvalidFileFormatException("Submission failed: invalid file format");
        }
        if (submissionTime.isAfter(deadline)) {
            throw new LateSubmissionException("Submission failed: submission is late");
        }
        System.out.println("Exam submitted successfully");
    }
}
