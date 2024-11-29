package stream.filterAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FMEx1 {
    public static void main(String[] args) {
        List<String> teamA = Arrays.asList("John", "Marry", "Kyle");
        List<String> teamB = Arrays.asList("Tom", "Jerry", "Mat");
        List<String> teamC = Arrays.asList("Mark", "Renee", "Destiny");

        List<List<String>> finalTeam = new ArrayList<>();
        finalTeam.add(teamA);
        finalTeam.add(teamB);
        finalTeam.add(teamC);
        System.out.println("final team :  " + finalTeam);

        //Before Java 8
        /*for (List<String> team : finalTeam) {
            for (String name : team) {
                System.out.println(name);
            }
        }*/

        List<String> names = finalTeam.stream().flatMap(pList -> pList.stream()).collect(Collectors.toList());
        System.out.println(names);
    }
}
