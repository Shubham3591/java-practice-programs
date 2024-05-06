package collectionPractice;
import java.util.*;
public class Collections_ADuplicateNumber {
    public static void main(String args[]){
    int[] num={1, 3, 1, 5, 6, 7, 3, 5,3};

    Map<Integer, Integer> m=new LinkedHashMap<>();

    for(Integer n : num){
        if(m.containsKey(n)){
            m.put(n, m.get(n)+1);
        }else{
            m.put(n, 1);
        }
    }

    for(Map.Entry<Integer, Integer> me : m.entrySet()){
        if(me.getValue()>1)
        {
            System.out.println(me.getKey()+":"+me.getValue());
        }
    }

}}

// int num1=123345;
//  int num[]=Integer.toString(num1).chars().map(c -> c-'0').toArray();
/*


Integer.toString(num1): Converts the integer variable num1 to its string representation. This is necessary because the chars() method is applicable to CharSequence, which includes strings.

.chars(): This method converts the string obtained in the previous step to an IntStream, which represents a sequence of primitive int-valued elements.

.map(c -> c-'0'): This part of the code is a lambda expression used in conjunction with the map() method. It converts each character to its corresponding integer value. When you subtract '0' from a character in Java, it effectively subtracts the ASCII value of '0' from the ASCII value of the character, which results in getting the numerical value represented by that character. For example, '5' - '0' results in 5.

.toArray(): Finally, this method converts the IntStream obtained from the previous step into an integer array. The resulting array contains the integer representations of the characters in the original string obtained from Integer.toString(num1).

So overall, the line of code converts an integer num1 into an array of integers, where each element of the array represents one digit of the original integer num1.
*/
