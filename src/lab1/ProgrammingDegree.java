package lab1;

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
    private double credits;

    // These methods are common to each of the sub-classes.
    public String getCourseName() {
        return courseName;
    }    

    public String getCourseNumber() {
        return courseNumber;
    }

    public double getCredits() {
        return credits;
    }

    // These methods are becoming abstract, as some sub-classes currently require
    //validation.  Therefore, each sub-class can provide it's own implementation
    // of this method.
    public abstract void setCourseName(String courseName);
    
    public abstract void setCourseNumber(String courseNumber);

    public abstract void setCredits(double credits);
}
