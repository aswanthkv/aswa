package functinterface;



public class Lambda {
    public static void main(String[] args) {
        int width=10;
        //with lambda
        Drawable d2=(x)-> System.out.println("drawing: "+width+"\n"+"name: "+x);
        d2.draw("rhombus");
    }
}
