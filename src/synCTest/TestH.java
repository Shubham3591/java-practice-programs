package synCTest;

import java.util.LinkedHashMap;
import java.util.Map;

public class TestH {
    public static void main(String[] args) {

        String s = "I like software testing and I like to play soccer";
        System.out.println(s);
        String [] words=s.split(" ");

        Map<String, Integer> m= new LinkedHashMap<>();

        for(String w: words)
        {
            if(m.containsKey(w)){
                m.put(w, m.get(w)+1);
            }
            else{
                m.put(w, 1);
            }
        }

        for(Map.Entry<String, Integer> me : m.entrySet()){
            if(me.getValue()>1){

                System.out.println(me.getKey()+" "+me.getValue());
            }

        }
    }
}
