package sdp.prac2;

import java.util.*;

public class SimpleFunctions {

  public SimpleFunctions() {}

  /** Function to return the sum of the elements of a at the indices specified by b
   * <BR><I>Pre-Condition</I>    Both of the lists are lists of integers<BR>
   * <BR><I>Post-Condition</I>   NONE<BR>
   * @param a    List of integers
   * @param b    List of integers
   * @return     The sum of the elements of a at the indices specified by b
   */
  public int Task1(List<Integer> a, List<Integer> b) {
    int sum = 0;
    for (int i = 0; i < b.size(); i++) {
      int indexToGet = b.get(i);
      if (indexToGet < a.size()) {
        sum += a.get(indexToGet);
      } //tried to put "then" afte the for line, #thanks Fsharp
    }
    return sum;
  }

  public static List<String> Task2(List<String> a) {
    List<String> output = new ArrayList<String>();
    for (int i = 0; i < a.size(); i++) {
      String element = a.get(i);
      if (element.length() > 1) {
        output.add(element.substring(1));
      }
    }
    return output;
  }

  public static boolean Task3(List<String> st) {
    int count = 0;
    for (int i = 0; i < st.size(); i++) {
      String s = st.get(i);
      switch (s) {
        case "(":
          count++;
          break;
        case ")":
          count--;
          break;
        default:
          break;
      }
      if (count < 0) {
        return false;
      }
    }
    return count == 0;
  }
  public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<Integer>();   //create new list to store the new elements 
        if (a.size() < b.size() || a.size() > b.size()) {
            return null;     //returns null if lists are not same size
        } else {
            int mult = 0;
            for (int i = 0; i < a.size(); i++){
                //iterates through list multiplying necessary elements 
                //adds result to the new list
                mult = a.get(i) * b.get(b.size() -1 - i);
                res.add(mult);
            }
            return res;
        }
    }

  public static boolean Task5(List<Integer> a) {
    int n = a.size();
    for (int i = 1; i < n; i++) {
      if (a.get(i) < a.get(i - 1)) {
        return false;
      }
    }
    return true;
  }

  public static List<Integer> Task6 (List<Integer> numbers) {
    /*
    Rounds up each number in the provided integer list to the next-highest multiple of 100. 
    If a number is already a multiple of 100, it is left unchanged. 
    
    Arguments:
    numbers -- list of integers
    
    Returns:
    A new list of integers where each number has been rounded up to the next-highest multiple of 100.
    */
    
    List<Integer> result = new ArrayList<>();

    for (int number : numbers) {
      if (number % 100 == 0) {
        result.add(number);
      } else {
        int next100 = ((number / 100) + 1) * 100;
        result.add(next100);
      }
    }

    return result;
  }
}
