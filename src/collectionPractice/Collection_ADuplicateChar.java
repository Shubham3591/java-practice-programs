package collectionPractice;

import java.util.Arrays;
import java.util.LinkedHashMap;
import java.util.Map;

public class Collection_ADuplicateChar {
    public static void main(String [] args){

    String s="My name is Shubham my name";
    char c[]=s.toCharArray();
    System.out.println(Arrays.toString(c));

    Map<Character, Integer> m=new LinkedHashMap<Character, Integer>();

    for(Character ch :  c){
        if(m.containsKey(ch))
        {
            m.put(ch, m.get(ch)+1);
        }else{
            m.put(ch, 1);
        }
        }

    for(Map.Entry<Character, Integer> me : m.entrySet()){
        if(me.getValue()>1){
            System.out.println(me.getKey()+":"+me.getValue());
        }
    }

    }}

