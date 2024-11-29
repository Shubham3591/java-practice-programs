package stream.map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class StreamMapEx2 {
    public static void main(String[] args) {
        List<String> vehicles = Arrays.asList("bus", "car", "jeep", "train", "bicycles");
        List<Integer> vLength = new ArrayList<>();

        vLength = vehicles.stream().map(v1 -> v1.length()).collect(Collectors.toList());
        System.out.println(vLength);
    }
}
