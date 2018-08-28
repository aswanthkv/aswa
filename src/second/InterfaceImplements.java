package second;

public class InterfaceImplements implements InterfaceExample {

    final int o=10;



    @Override
    public void add(int x, int y) {
        System.out.println(x+y);
    }

    @Override
    public void display() {
        System.out.println("display method");

    }

    public static void main(String[] args) {

        InterfaceImplements i=new InterfaceImplements();
        i.add(2,3);
        i.display();


    }
}
