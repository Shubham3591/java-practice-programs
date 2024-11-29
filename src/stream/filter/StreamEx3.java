package stream.filter;

import java.util.Arrays;
import java.util.List;

public class StreamEx3 {
    public static void main(String[] args) {
        List<String> list = Arrays.asList("Jerry", null, "peter", "Renee", null, "Tom");

        List<String> newList
                = list.stream().filter(l -> l != null).toList();
        System.out.println(newList);
    }
}
