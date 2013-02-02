package lab2;

/**
 * Describe responsibilities here.
 *
 * @author      Dawn Bykowski
 * @version     1.00
 */
public class IntroJavaCourse implements ProgrammingDegree {
    private String courseName;
    private String courseNumber;
    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    // Implemented this method, as it is inherited from the interface and I
    // believe it should have been here to begin with, as the courseName property
    // is required as part of the constructor.
    public void setCourseName(String courseName) {
        this.courseName = courseName;
    }
    
    public String getCourseNumber() {
        return courseNumber;
    }

    public void setCourseNumber(String courseNumber) {
        this.courseNumber = courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    public void setCredits(double credits) {
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }


}
