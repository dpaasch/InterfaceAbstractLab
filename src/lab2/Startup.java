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
        
        advJavaCourse.setCourseName("AdvJava");
        advJavaCourse.setCourseNumber("A-1233");
        advJavaCourse.setCredits(3.0);
        advJavaCourse.setPrerequisites("IntroJavaCourse");
        
        System.out.println(advJavaCourse);
    }
        
}
