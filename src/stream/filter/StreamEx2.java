package stream.filter;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamEx2 {
    public static void main(String[] args) {

        List<String> list = Arrays.asList("ShubhamSahu", "Ajayrathore", "Shubh", "Tom", "Jeery");
        List<String> newList = new ArrayList<String>();

        newList = list.stream().filter(str -> str.length() > 5 && str.length() < 15).collect(Collectors.toList());
        System.out.println(newList);

        list.stream().filter(str -> str.length() > 5 && str.length() < 15).forEach(System.out::println);
    }
}
