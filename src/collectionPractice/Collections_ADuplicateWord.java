package collectionPractice;
import java.util.*;

public class Collections_ADuplicateWord {
    public static void main(String args[]){
    String s="My Name is Shubham My Name";
    String words[]=s.split(" ");

    Map<String, Integer> m= new LinkedHashMap<>();

    for(String w : words){
        if(m.containsKey(w)){
            m.put(w, m.get(w)+1);
        }else {
            m.put(w, 1);
        }}

        for(Map.Entry<String, Integer> me: m.entrySet()){
            if(me.getValue()>1){
                System.out.println(me.getKey()+":"+me.getValue());
            }
        }

    }
}
