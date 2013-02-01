package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author Dawn Bykowski
 * @version 1.00
 */
public class IntroToProgrammingCourse extends ProgrammingDegree {

    public IntroToProgrammingCourse(String courseName, String courseNumber) {
        super(courseName, courseNumber);
    }

    public void setCredits(double credits) {
        if (credits < 0.5 || credits > 4.0) {
            JOptionPane.showMessageDialog(null,
                    "Error: credits must be in the range 0.5 to 4.0");
            System.exit(0);
        }
        // Changing this to the setCredits method: this.credits = credits;
        setCredits(credits);
    } 
}
/**
 * Have made the following changes within this sub-class to clean-up/simplify
 * the code:
 * 1) Moved these properties to the superclass, as they are common among each of 
 * the sub-classes.
 * private String courseName;
 * private String courseNumber;
 * private double credits;
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
 * public final void setCourseName(String courseName) {
 *  if (courseName == null || courseName.length() == 0) {
 *      JOptionPane.showMessageDialog(null,
 *          "Error: courseName cannot be null of empty string");
 *      System.exit(0);
 *      }
 *      this.courseName = courseName;
 * }
 *
 * public final void setCourseNumber(String courseNumber) {
 *  if (courseNumber == null || courseNumber.length() == 0) {
 *      JOptionPane.showMessageDialog(null,
 *          "Error: courseNumber cannot be null of empty string");
 *      System.exit(0);
 *      }
 *      this.courseNumber = courseNumber;
 * }
 * 
 * public String getCourseNumber() {
 *  return courseNumber;
 * }
 * 
 * public double getCredits() {
 *  return credits;
 * }
 */