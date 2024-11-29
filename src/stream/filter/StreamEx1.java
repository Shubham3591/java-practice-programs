package stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class StreamEx1 {
    public static void main(String[] args) {
        List<Integer> list = Arrays.asList(10,20,22,33,44,55,66);
        List<Integer> evenList = new ArrayList<Integer>();


        //without using Stream
       /* for (Integer l : list){
            if(l % 2 == 0){
                evenList.add(l);
            }
        }
        System.out.println(evenList);*/

        //with Stream
        /*evenList = list.stream().filter(n -> n % 2 == 0).collect(Collectors.toList());
        System.out.println(evenList);*/

        //list.stream().filter(n -> n % 2 == 0).forEach( n -> System.out.println(n));

        list.stream().filter(n -> n % 2 == 0).forEach(System.out::println);
    }
}
