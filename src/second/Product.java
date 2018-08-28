package second;

public class Product {

    int pid,price;
    String pname;

    public Product(int pids, int prices, String pnames) {
        pid = pids;
        price = prices;
        pname = pnames;
    }

    public static void main(String[] args)
    {
        Product p1=new Product(1,999,"A");
        Product p2=new Product(2,1001,"B");
        Product p3=new Product(3,1024,"C");
        Product p4=new Product(4,456,"D");

        Product parray[]={p1,p2,p3,p4};

        for (Product obj:parray)
        {
            if (obj.price>=1000)
            {
                System.out.println("Product id is "+obj.pid+" Product name is "+obj.pname+" Product price is "+obj.price);
            }
        }
    }
}
