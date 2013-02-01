package lab1;

import javax.swing.JOptionPane;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
 *
 * @author Dawn Bykowski
 * @version 1.00
 */
public abstract class ProgrammingDegree {

    // These properties are common among all sub-classes and belong here, so as
    // not to duplicate efforts.
    private String courseName;
    private String courseNumber;
  
    // Constructor that accepts as arguments the courseName and courseNumber for
    // each offered class.
    public ProgrammingDegree(String cName, String cNumber) {
        courseName = cName;
        courseNumber = cNumber;
    }
   
    // These methods are common to each of the sub-classes.
    public String getCourseName() {
        return courseName;
    }
//
//    public String getCourseNumber() {
//        return courseNumber;
//    }

    // These methods are becoming final.  This forces validation for each of 
    // these methods, as they are the same in all three sub-classes.
    public final void setCourseName(String courseName) {
        if (courseName == null || courseName.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseName cannot be null of empty string");
            System.exit(0);
        }
        this.courseName = courseName;
    }

    public final void setCourseNumber(String courseNumber) {
        if (courseNumber == null || courseNumber.length() == 0) {
            JOptionPane.showMessageDialog(null,
                    "Error: courseNumber cannot be null of empty string");
            System.exit(0);
        }
        this.courseNumber = courseNumber;
    }

    // Changing this to an abstract method, so each sub-class can set their
    // own requirements for the validation.
    public abstract void setCredits(double credits);
    
    // Method: toString() shows the state of the object
    @Override
    public String toString() {
        String string;
        
        string = "Course Name: " + courseName
                + "\nCourse Number: " + courseNumber;
        return string;      
    }
}
