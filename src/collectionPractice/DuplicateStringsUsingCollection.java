package collectionPractice;
import java.util.*;

public class DuplicateStringsUsingCollection {
    public static void main(String args[]){
        String s="My name is Shubham name is";
        String [] word=s.split(" ");

        HashMap<String, Integer> m= new HashMap<>();

        for(String w: word){
            if(m.containsKey(w)){
                m.put(w, m.get(w)+1);
            }
            else {
                m.put(w, 1);
            }
        }

        for(Map.Entry<String, Integer> me: m.entrySet()){
            if(me.getValue()>1){
                System.out.println(me.getKey()+" "+ me.getValue());
            }
        }

    }
}
