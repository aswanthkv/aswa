package functinterface;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class Product {
    int price;
    String name;

    Product(int price,String name)
    {
        this.price=price;
        this.name=name;
    }

    public static void main(String[] args) {
        ArrayList<Product> al=new ArrayList<>();
        al.add(new Product(100,"twix"));
        al.add(new Product(220,"silk"));
        al.add(new Product(436,"tobleron"));
        List<String> pp=al.stream().filter(g->g.price>100).map(p->p.name).collect(Collectors.toList());
        System.out.println(pp);
        System.out.println("***************");
        pp.stream().forEach(f-> System.out.println(f));

//        Stream<Product> s=al.stream();
//        s.filter(x->x.price>100).forEach(z-> System.out.println(z.name+" "+z.price));


    }
}
