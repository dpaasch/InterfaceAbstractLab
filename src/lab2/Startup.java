package lab2;

/**
 * Describe responsibilities here.
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
