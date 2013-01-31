package lab1;

/**
 * Describe responsibilities here.
 *
 * @author Dawn Bykowski
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingDegree {
    // Moving these properties to the superclass, as they are common among each
    // of the sub-classes.
    // private String courseName;
    // private String courseNumber;
    // private double credits;

    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        this.courseName = courseName;
        this.courseNumber = courseNumber;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

//    // Inherited methods, which are no longer needed here.
//    public String getCourseNumber() {
//        return courseNumber;
//    }
    
//    public void setCourseNumber(String courseNumber) {
//        this.courseNumber = courseNumber;
//    }
    
//    public double getCredits() {
//        return credits;
//    }
//    public void setCredits(double credits) {
//        if (credits < 0 || credits > 5.0) {
//            System.out.println(
//                    "Error: credits must be in the range 0.5 to 4.0");
//            System.exit(0);
//        }
//        this.setCredits(credits);
//    }
}
