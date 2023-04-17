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
    @Test void Task3(){
         // Test 1
        // Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        List<String> data = Arrays.asList("((()))", "(()))", "(((((((((())))))))))", "(())()", ")(())");
        List<String> expected = Arrays.asList("true", "false", "true", "true", "false");
        // Act
        List<String> result = classBeingTested.Task3(data);
        // Assert
        assertIterableEquals(expected, result);
        // Test 2
        // Arrange
        List<String> data2 = Arrays.asList("((()))))))", "((((((((()))))))))))))))))", "((()))");
        List<String> expected2 = Arrays.asList("false", "false", "true");
        // Act
        List<String> result2 = classBeingTested.Task3(data2);
        // Assert
        assertIterableEquals(expected2, result2);
        // Test 3
        // Arrange
        List<String> data3 = Arrays.asList("", "(((((((())))", "((()))");
        List<String> expected3 = Arrays.asList("false", "false", "true");
        // Act
        List<String> result3 = classBeingTested.Task3(data3);
        // Assert
        assertIterableEquals(expected3, result3);
    }
    @Test void Task6(){
        //test 1
        //Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        List<Integer> data = Arrays.asList(200, 345, 500, 1789);
        List<Integer> expectedOutput = Arrays.asList(200, 400, 500, 1800);
        // Act
        List<Integer> result = classBeingTested.Task6(data);
        // Assert
        assertIterableEquals(expectedOutput, result);

        // test 2
        // Arrange
        List<Integer> data2 =  Arrays.asList();
        List<Integer> expectedOutput2 = Arrays.asList();
        // Act 
        List<Integer> result2 = classBeingTested.Task6(data2);
        // Assert
        assertIterableEquals(expectedOutput2, result2);

        // test 3
        // Arrange
        List<Integer> data3 =  Arrays.asList(-200, -345, -500, -1789);
        List<Integer> expectedOutput3 = Arrays.asList(-100, -300, -500, -1700);
        // Act 
        List<Integer> result3 = classBeingTested.Task6(data3);
        // Assert
        assertIterableEquals(expectedOutput3, result3);

    }
}
