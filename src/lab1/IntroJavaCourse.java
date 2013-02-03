package lab1;

/**
 * Describe responsibilities here.
 *
 * @author Dawn Bykowski
 * @version 1.00
 */
public class IntroJavaCourse extends ProgrammingDegree {

    private double credits;
    private String prerequisites;

    public IntroJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        this.prerequisites = prerequisites;
    }

    public double getCredits() {
        return credits;
    }
    
    public void setCredits(double credits) {
        if (credits < 0 || credits > 5.0) {
            System.out.println(
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }
    
    // Method: toString() shows the state of the object
    @Override
    public String toString() {
        String introJavaString;
        
        introJavaString = super.toString()
                + "\n IntroJava Credits: " + credits
                + "\n IntroJavaCourse Prerequisites: " + prerequisites
                + "\n";
        return introJavaString;      
    }
}
/**
 * Have made the following changes within this sub-class to clean-up/simplify
 * the code:
 * 1) Moved these properties to the superclass, as they are common among each of 
 * the sub-classes.
 * private String courseName;
 * private String courseNumber;
 * 
 * 2) As these properties are now in the superclass, I cannot any longer call 
 * these private properties from the constructor.   
 * this.courseName = courseName;
 * this.courseNumber = courseNumber;
 * Therefore, I had changed them to call the applicable set methods (see below), 
 * until I realized that calling the superclass to load the constructor properties 
 * was a better path forward.
 * setCourseName(courseName);
 * setCourseNumber(courseNumber);
 * 
 * 3) These are now inherited methods, so they are no longer required here.
 * public String getCourseNumber() {
 * return courseNumber;
 * }
 * 
 * public void setCourseNumber(String courseNumber) {
 * this.courseNumber = courseNumber;
 * }
 * 
 * public double getCredits() {
 * return credits;
 * }
 */