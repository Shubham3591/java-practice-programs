package stream.filterAndMap;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.stream.Collectors;

public class FMEx2 {
    String name;
    int id;
    String grade;

    FMEx2(String name, int id, String grade){
        this.name =  name;
        this.id = id;
        this.grade = grade;
    }

    public static void main(String[] args) {

        List<FMEx2> studentList1 = new ArrayList<>();
        studentList1.add(new FMEx2("Tom", 101, "A"));
        studentList1.add(new FMEx2("Wallace", 102, "B"));
        studentList1.add(new FMEx2("John", 103, "C"));

        List<FMEx2> studentList2 = new ArrayList<>();
        studentList1.add(new FMEx2("Renee", 104, "D"));
        studentList1.add(new FMEx2("Destiny", 105, "E"));
        studentList1.add(new FMEx2("Marken", 106, "F"));

        List<List<FMEx2>> finalStudentList = Arrays.asList(studentList1, studentList2);
        System.out.println(finalStudentList);

        List<String> names = finalStudentList
                .stream()
                .flatMap(f -> f.stream())
                .map(s -> s.name)
                .collect(Collectors.toList());
        System.out.println(names);

    }
}
