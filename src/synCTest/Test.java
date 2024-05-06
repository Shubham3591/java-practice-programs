package synCTest;

import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.Map;

public class Test {
    public static void main(String[] args) {
        String s="Hello World";

        char[] c= s.toCharArray();

        Map<Character, Integer> m=new LinkedHashMap<>();

        for(char dc: c)
        {
            if(m.containsKey(dc))
            {
                m.put(dc, m.get(dc)+1);
            }
            else{
                m.put(dc, 1);
            }
        }

        for(Map.Entry<Character, Integer> me: m.entrySet()){
            if(me.getValue()==1)
            {
                System.out.print(me.getKey()+" ");
            }
        }

    }
}
