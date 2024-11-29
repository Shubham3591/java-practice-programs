package stream.filter;

import java.util.ArrayList;
import java.util.List;

public class StreamEx4 {
    int id;
    String laptopName;
    int price;

    StreamEx4(int id, String laptopName, int price)
    {
        this.id = id;
        this.laptopName = laptopName;
        this.price = price;
    }
    public static void main(String[] args) {
        List<StreamEx4> productList = new ArrayList<StreamEx4>();
        productList.add(new StreamEx4(1, "Dell", 25000));
        productList.add(new StreamEx4(2, "Acer", 23000));
        productList.add(new StreamEx4(1, "Lenovo", 28000));
        productList.add(new StreamEx4(1, "Sony", 30000));
        productList.add(new StreamEx4(1, "Apple", 80000));

        productList.stream().filter(p -> p.price > 25000)
                .forEach(pr -> System.out.println(pr.price));


    }
}
