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

    public static boolean Task5 (List<Integer> a){
        int n = a.size();
        for(int i = 1; i < n; i++){
            if(a.get(i)<a.get(i-1)){
                return false;
            }
        }
        return true;
    }
}
