package lab2;

/**
 * I personally cannot think of a better way to improve on this design.  Using
 * an interface as superclass, has improved the design from lab #1.  The common 
 * properties, unfortunately, were left within each sub-class.  I considered
 * moving the common properties to IntroToProgrammingCourse, and making it
 * abstract, but the two other sub-classes did not have an "IS-A" relationship
 * with the IntroToProgrammingCourse.  Therefore, I was unable to consciously
 * make this change.  It may have been better to have an additional class that
 * could have been abstract, that would have incorporated all common properties 
 * and would have been a better way to simplify the sub-classes.  Then the sub-
 * classes could have inherited these.  Liskov's Substitution principle could 
 * possibly have been used in this scenario.  Unfortunately, I am still not 100%
 * comfortable with interfaces and abstract to fully understand how I could have
 * fully implemented Liskov's Substitution here.  I am hoping that by the
 * time I complete Lab #3, I will have a better understanding.  Note - Please see 
 * additional comments at the bottom of each sub-class.
 *
 * @author      Dawn Bykowski
 * @version     1.00
 */
public class Startup {
    
    public static void main(String[] args) {
        
        // Create an AdvancedJavaCourse object
        AdvancedJavaCourse advJavaCourse = new AdvancedJavaCourse("AdvJava", "A-1234");
        
        advJavaCourse.setCourseName("AdvancedJava");
        advJavaCourse.setCourseNumber("A-1233");
        advJavaCourse.setCredits(4.0);
        advJavaCourse.setPrerequisites("IntroJavaCourse");
        
        System.out.println(advJavaCourse);
        
        // Create an IntroJavaCourse object
        IntroJavaCourse introJavaCourse = new IntroJavaCourse("IntroJava", "I-2345");
        
        // Store values for Course Name, Course Number, Credits, and Prerequesites.
        introJavaCourse.setCourseName("IntroJava");
        introJavaCourse.setCourseNumber("I-2675");
        introJavaCourse.setCredits(4.0);
        introJavaCourse.setPrerequisites("IntroToProgramming");
        
        System.out.println(introJavaCourse);
        
        // Create an IntroToProgrammingCourse object
        IntroToProgrammingCourse introToProgrammingCourse = 
                new IntroToProgrammingCourse("IntroToProgramming", "IP-3456");
        
        // Store values for Course Name, Course Number, and Credits.
        introToProgrammingCourse.setCourseName("IntroToProgramming");
        introToProgrammingCourse.setCourseNumber("IP-5487");
        introToProgrammingCourse.setCredits(3.0);
        
        System.out.println(introToProgrammingCourse);
    }
        
}
