package second;

public class AbstractExtends extends AbstractExample {


    @Override
    public void add(int x, int y) {

        int sum=x+y;
        System.out.println(sum);
        System.out.println("Y");

    }

    @Override
    public String showMessage(String message) {
        return message;
    }

    public static void main(String[] args) {

        AbstractExtends ae=new AbstractExtends();
        ae.add(2,3);
        System.out.println(ae.showMessage("hello"));
        AbstractExample obj=new AbstractExtends();//AbstractExample obj=new AbstractExtends is not possible
        ae.display();
        obj.display();
    }
}
