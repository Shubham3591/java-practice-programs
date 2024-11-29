package stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx1 {
    public static void main(String[] args) {
        List<String> str = Arrays.asList("tom", "jerry", "prem", "manish");
        List<String> newStr = new ArrayList<>();

        newStr = str.stream().map(s -> s.toUpperCase()).collect(Collectors.toList());
        System.out.println(newStr);

        str.stream().map(s1 -> s1.toUpperCase()).forEach(System.out::println);
    }
}
