package lab1;

import java.util.Scanner;

/**
 * I personally cannot think of a better way to improve on this design.  I did 
 * not have to re-implement any of the methods, and did not have to re-
 * declare any of the properties in the sub-classes.  I only moved 2 common
 * properties to the Abstract class - courseName and courseNumber.  Using an 
 * abstract class, allowed for me to move common properties and methods to 
 * the superclass, which simplified the sub-classes code.  To me this makes for
 * better code then using full concrete methods, where everything is inherited.
 * Unfortunately, I was not able to declare a variable using it's abstract type;
 * I received errors with the setPrerequisites() method for both the AdvancedJavaCourse
 * object and for the IntroJavaCourse object.  It would be advantageous to declare
 * a variable using it's abstract type when all the properties required are found
 * within the superclass.
 *
 * @author Dawn Bykowski
 * @version 1.00
 */
public class Startup {
    
    public static void main(String[] args){
        
        // Create an AdvancedJavaCourse object
        AdvancedJavaCourse advancedJava = new AdvancedJavaCourse("AdvJava", "A-1234");
        
        // Store values for Course Name, Course Number, Credits, and Prerequesites.
        advancedJava.setCourseName("AdvancedJava");
        advancedJava.setCourseNumber("A-1234");
        advancedJava.setCredits(4.0);
        advancedJava.setPrerequisites("IntroJava");
        
        System.out.println(advancedJava);
        
        // Create an IntroJavaCourse object
        IntroJavaCourse introJava = new IntroJavaCourse("IntroJava", "I-2345");
        
        // Store values for Course Name, Course Number, Credits, and Prerequesites.
        introJava.setCourseName("IntroJava");
        introJava.setCourseNumber("I-2334");
        introJava.setCredits(4.0);
        introJava.setPrerequisites("IntroToPrgm");
        
        System.out.println(introJava);
        
        // Create an IntroToProgrammingCourse object
        IntroToProgrammingCourse introProgramming = 
                new IntroToProgrammingCourse("IntroToProgramming", "P-3456");
        
        // Store values for Course Name, Course Number, and Credits.
        introProgramming.setCourseName("IntroToProgramming");
        introProgramming.setCourseNumber("P-3534");
        introProgramming.setCredits(3.0);
        
        System.out.println(introProgramming);
        
    }
}
