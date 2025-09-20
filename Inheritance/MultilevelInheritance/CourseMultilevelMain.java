// Multilevel Inheritance Sample 2: Educational Course Hierarchy

class Course {
    private String courseName;
    private int duration; // in hours

    public Course(String courseName, int duration) {
        this.courseName = courseName;
        this.duration = duration;
    }

    public String getCourseName() { return courseName; }
    public int getDuration() { return duration; }
}

class OnlineCourse extends Course {
    private String platform;
    private boolean isRecorded;

    public OnlineCourse(String courseName, int duration, String platform, boolean isRecorded) {
        super(courseName, duration);
        this.platform = platform;
        this.isRecorded = isRecorded;
    }

    public String getPlatform() { return platform; }
    public boolean isRecorded() { return isRecorded; }
}

class PaidOnlineCourse extends OnlineCourse {
    private double fee;
    private double discount; // 0..1

    public PaidOnlineCourse(String courseName, int duration, String platform, boolean isRecorded, double fee, double discount) {
        super(courseName, duration, platform, isRecorded);
        this.fee = fee;
        this.discount = discount;
    }

    public double finalPrice() { return fee * (1 - discount); }

    public void displayInfo() {
        System.out.println("PaidOnlineCourse [name=" + getCourseName() + ", duration=" + getDuration() + "h, platform=" + getPlatform() + ", recorded=" + isRecorded() + ", price=" + finalPrice() + "]");
    }
}

public class CourseMultilevelMain {
    public static void main(String[] args) {
        PaidOnlineCourse poc = new PaidOnlineCourse("Java OOP", 20, "Udemy", true, 1999.0, 0.25);
        poc.displayInfo();
    }
}
