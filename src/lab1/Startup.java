package lab1;

import java.util.Scanner;

/**
 * Describe responsibilities here. NOTE: this class has NO PREREQUISITES! Do not
 * change this fact.
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
