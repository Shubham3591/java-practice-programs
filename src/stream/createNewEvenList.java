package stream;

import java.util.ArrayList;
import java.util.List;

public class createNewEvenList {

    public static void main(String[] args) {
        List<Integer> list1= List.of(1,2,3,4,5,6,7,8,9);

        List<Integer> listEven= new ArrayList<>();

        for(Integer i: list1)
        {
            if(i%2 ==0)
            {
                listEven.add(i);
            }

        }
        System.out.println(listEven);

        list1.stream();
    }





}
