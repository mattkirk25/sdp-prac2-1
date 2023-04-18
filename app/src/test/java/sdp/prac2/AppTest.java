/*
 * This Java source file was generated by the Gradle 'init' task.
 */
package sdp.prac2;
import java.util.*;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

class AppTest {
  
		@Test void testTask1() {
        // Test 1
        List<Integer> a1 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> b1 = Arrays.asList(0, 2, 4);
        int expectedSum1 = 10 + 30 + 50;

        int actualSum1 = 0;
        for (int i = 0; i < b1.size(); i++) {
            int indexToGet = b1.get(i);
            if (indexToGet < a1.size()) {
                actualSum1 += a1.get(indexToGet);
            }
        }

        assert actualSum1 == expectedSum1 : "Test 1 failed: Expected " + expectedSum1 + ", but got " + actualSum1;

        // Test 2
        List<Integer> a2 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> b2 = Arrays.asList();
        int expectedSum2 = 0;

        int actualSum2 = 0;
        for (int i = 0; i < b2.size(); i++) {
            int indexToGet = b2.get(i);
            if (indexToGet < a2.size()) {
                actualSum2 += a2.get(indexToGet);
            }
        }

        assert actualSum2 == expectedSum2 : "Test 2 failed: Expected " + expectedSum2 + ", but got " + actualSum2;

        // Test 3
        List<Integer> a3 = Arrays.asList(10, 20, 30, 40, 50);
        List<Integer> b3 = Arrays.asList(3, 5, 7);
        int expectedSum3 = 0;

        int actualSum3 = 0;
        for (int i = 0; i < b3.size(); i++) {
            int indexToGet = b3.get(i);
            if (indexToGet < a3.size()) {
                actualSum3 += a3.get(indexToGet);
            }
        }

        assert actualSum3 == expectedSum3 : "Test 3 failed: Expected " + expectedSum3 + ", but got " + actualSum3;
    }

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
        List<boolean> expected = Arrays.asList(true, false, true, true, false);
        // Act
        List<boolean> result = classBeingTested.Task3(data);
        // Assert
        assertIterableEquals(expected, result);
        // Test 2
        // Arrange
        List<String> data2 = Arrays.asList("((()))))))", "((((((((()))))))))))))))))", "((()))");
        List<boolean> expected2 = Arrays.asList(false, false, true);
        // Act
        List<boolean> result2 = classBeingTested.Task3(data2);
        // Assert
        assertIterableEquals(expected2, result2);
        // Test 3
        // Arrange
        List<String> data3 = Arrays.asList("", "(((((((())))", "((()))");
        List<boolean> expected3 = Arrays.asList(false, false, true);
        // Act
        List<boolean> result3 = classBeingTested.Task3(data3);
        // Assert
        assertIterableEquals(expected3, result3);
    }

    //Task 4 - method to accept lists of integers a and b, and
    //multiplies the first element of a with the last element of b, then the
    //second element of a with the second-last element of b, and so on. The
    //resulting list is returned. If lists are different sizes, return null.
    @Test void Task4(){
        //Test 1
        //Arrange 
        SimpleFunctions classBeingTested = new SimpleFunctions();
        List<Integer> a = Arrays.asList(1,2,3,4);
        List<Integer> b = Arrays.asList(5,6,7,8);
        List<Integer> expected = Arrays.asList(8,14,18,20);
        //Act
        List<Integer> result = classBeingTested.Task4(a,b);
        //Assert
        assertIterableEquals(expected, result);

        //Test 2
        //Arrange 
        List<Integer> a2 = Arrays.asList(5,66,3,2);
        List<Integer> b2 = Arrays.asList(5,6,7);
        List<Integer> expected2 = null;
        //Act
        List<Integer> result2 = classBeingTested.Task4(a2,b2);
        //Assert
        assertIterableEquals(expected2, result2);

        //Test 3
        //Arrange 
        List<Integer> a3 = Arrays.asList(4,6,3,99);
        List<Integer> b3 = Arrays.asList(5,10,7,3);
        List<Integer> expected3 = Arrays.asList(12,42,30,495);
        //Act
        List<Integer> result3 = classBeingTested.Task4(a3,b3);
        //Assert
        assertIterableEquals(expected3, result3);

        //Test 4
        //Arrange 
        List<Integer> a4 = Arrays.asList(5,66);
        List<Integer> b4 = Arrays.asList(5,6,7);
        List<Integer> expected4 = null;
        //Act
        List<Integer> result4 = classBeingTested.Task4(a4,b4);
        //Assert
        assertIterableEquals(expected4, result4);
    }

  @Test void Task5(){
        //Test 1
        //Arrange
        SimpleFunctions classBeingTested = new SimpleFunctions();
        List<Integer> a = Arrays.asList(1, 2, 3, 4, 5);
        boolean expected = true;
        //Act
        boolean result = classBeingTested.Task5(a);
        //Assert
        assertEquals(expected, result);

        //Test 2
        //Arrange
        List<Integer> b = Arrays.asList(1, 2, 6, 3, 4, 5);
        boolean expected1 = false;
        //Act
        boolean result1 = classBeingTested.Task5(b);
        //Assert
        assertEquals(expected1, result1);

        //Test 3
        //Arrange
        List<Integer> c = Arrays.asList(3, 4, 7, 9, 21);
        boolean expected2 = true;
        //Act
        boolean result2 = classBeingTested.Task5(c);
        //Assert
        assertEquals(expected2, result2);
    }
}
