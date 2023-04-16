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
    public int Task1 (List<Integer> a, List<Integer> b) {
        int sum = 0;
        for (int i = 0; i < b.size(); i++) {
            int indexToGet = b.get(i);
            if (indexToGet < a.size()){
                sum += a.get(indexToGet);
            }//tried to put "then" afte the for line, #thanks Fsharp
        }
        return sum;
    } 

    public static List<String> Task2 (List<String>  a){
        List<String> output = new ArrayList<String>();
        for(int i = 0 ; i < a.size(); i++){
            String element = a.get(i);
            if(element.length() > 1){
                output.add(element.substring(1));
            }
        };
        return output;
    }

    public static List<Integer> Task4(List<Integer> a, List<Integer> b) {
        List<Integer> res = new ArrayList<Integer>();   //create new list to store the new elements 
        if (a.size() != b.size()) {
            return null     //returns null if lists are not same size
        } else {
            int mult;
            for (int i = 0; i < a.size(); i++){
                //iterates through list multiplying necessary elements 
                //adds result to the new list
                mult = a.get(i) * b.get(b.size() - 1 - i);
                res.add(mult);
            }
            return res;
        }
    }
}
