package stream.filterAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class FMTerminalOpsEx1 {
    public static void main(String[] args) {

        List<String> vehicles = Arrays.asList("car", "bus", "car", "train", "bus", "bike", "cycle" );
        List<String> dVehicles = new ArrayList<>();

        // distinct
        dVehicles = vehicles.stream().distinct().collect(Collectors.toList());
        System.out.println(dVehicles);

        vehicles.stream().distinct().forEach(System.out::println);

        //count
        long count =  vehicles.stream().count();
        System.out.println(count);

        //limit
        List<String> limitedVehicleList =  vehicles.stream().limit(3).collect(Collectors.toList());
        System.out.println(limitedVehicleList);

        //sorting
        List<String> ascSorted = vehicles.stream().sorted().toList();
        System.out.println(ascSorted);

        //dsc
        List<String> dscSorted = vehicles.stream().sorted(Comparator.reverseOrder()).toList();
        System.out.println(dscSorted);

        List<String> fruits = new ArrayList<>();
        fruits.add("One Apple");
        fruits.add("One Orange");
        fruits.add("Two Banana");

        boolean result1 = fruits.stream().anyMatch(v-> {return v.startsWith("One");});
        System.out.println(result1);

        boolean result2 = fruits.stream().allMatch(v-> {return v.startsWith("One");});
        System.out.println(result2);

        boolean result3 = fruits.stream().noneMatch(v-> {return v.startsWith("One");});
        System.out.println(result3);

        List<String> finalList = Stream.concat(vehicles.stream(), fruits.stream()).toList();
        System.out.println(finalList);


    }
}
