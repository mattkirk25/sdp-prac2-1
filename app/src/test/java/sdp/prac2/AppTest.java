/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;
import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
    /**
     * Task 2 - Tests
     * Method which removes the first character from every element in a list. 
     * If an element has no characters, remove it from the output.
    */
    @Test void Task2(){
        // Test 1
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        List<String> data = Arrays.asList("hello", "world", "how", "are", "you", "now?");
        List<String> expected = Arrays.asList("ello", "orld", "ow", "re", "ou", "ow?");
        // Act
        List<String> result = classBeingTested.Task2(data);
        // Assert
        assertIterableEquals(expected, result);
        // Test 2
        // Arrange
        List<String> data2 = Arrays.asList("hello", "world", "how", "are", "you", "now?", "");
        List<String> expected2 = Arrays.asList("ello", "orld", "ow", "re", "ou", "ow?");
        // Act
        List<String> result2 = classBeingTested.Task2(data2);
        // Assert
        assertIterableEquals(expected2, result2);
        // Test 3
        // Arrange
        List<String> data3 = Arrays.asList("123456", "23456", "3456", "456", "56", "6", "");
        List<String> expected3 = Arrays.asList("23456", "3456", "456", "56", "6");
        // Act
        List<String> result3 = classBeingTested.Task2(data3);
        // Assert
        assertIterableEquals(expected3, result3);
        // Test 4
        // Arrange
        List<String> data4 = Arrays.asList("", "", "", "", "", "", "");
        List<String> expected4 = Arrays.asList();
        // Act
        List<String> result4 = classBeingTested.Task2(data4);
        // Assert
        assertIterableEquals(expected4, result4);
        // Test 5
        // Arrange
        List<String> data5 = Arrays.asList();
        List<String> expected5 = Arrays.asList();
        // Act
        List<String> result5 = classBeingTested.Task2(data5);
        // Assert
        assertIterableEquals(expected5, result5);
        
    }
}
