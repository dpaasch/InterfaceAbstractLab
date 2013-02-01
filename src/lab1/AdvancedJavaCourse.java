package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here.
 *
 * @author Dawn Bykowski
 * @version 1.00
 */
public class AdvancedJavaCourse extends ProgrammingDegree {
    private double credits;
    private String prerequisites;

    public AdvancedJavaCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public String getCapitalizedCourseName() {
        return getCourseName().toUpperCase();
    }
        
    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        this.credits = credits;
    }

    public String getPrerequisites() {
        return prerequisites;
    }

    public void setPrerequisites(String prerequisites) {
        if (prerequisites == null || prerequisites.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: prerequisites cannot be null of empty string");
            System.exit(0);
        }
        this.prerequisites = prerequisites;
    }
    
    // Method: toString() shows the state of the object
    @Override
    public String toString() {
        String advancedJavaString;
        
        advancedJavaString = super.toString()
                + "\n AdvancedJava Credits: " + credits
                + "\n AdvancedJavaCourse Prerequisites: " + prerequisites
                + "\n";
        return advancedJavaString;      
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
 * 2) As these private properties are now in the superclass, I have decided to
 * call the superclass constructor to populate this constructor.  Therefore, 
 * these statements are no longer required.
 * this.setCourseName(courseName);
 * this.setCourseNumber(courseNumber);
 * 
 * 3) These are now inherited methods, so they are no longer required here.
 * public String getCourseName() {
 *  return courseName;
 * }  
 * 
 * public void setCourseName(String courseName) {
 *  this.courseName = courseName;
 * }
 * 
 * public String getCourseNumber() {
 *  return courseNumber;
 * }
 * 
 * public void setCourseNumber(String courseNumber) {
 *  this.courseNumber = courseNumber;
 * 
 * public double getCredits() {
 *  return credits;
 * }
 */