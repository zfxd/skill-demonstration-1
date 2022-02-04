/**
 * Commands to run tests:   javac -cp ".;lib\junit-4.13.2.jar;lib\hamcrest-core-1.3.jar" CoolCourse.java CoolCourseTest.java
 * (Windows)                java -cp ".;lib/junit-4.13.2.jar;lib/hamcrest-core-1.3.jar" org.junit.runner.JUnitCore CoolCourseTest
 * 
 * (Unix)                   javac -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar CoolCourse.java CoolCourseTest.java
 *                          java -cp .:lib/junit-4.13.2.jar:lib/hamcrest-core-1.3.jar org.junit.runner.JUnitCore CoolCourseTest
 */

import static org.junit.Assert.*;
import org.junit.*;

public class CoolCourseTest {
    @Test
    public void isCoolCourse() {
        assertTrue("Is a cool course", CoolCourse.isCoolCourse("HUM 1"));   // Will fail
    }
}