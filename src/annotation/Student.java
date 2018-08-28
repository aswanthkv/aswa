package annotation;

import java.lang.reflect.Method;

public class Student {
    @Annotation(name="aswanth",location = "thrissur")
    public void getInfo()
    {

    }

    @Annotation(name="jishnu",location="pappady")
    public void getdata(){

    }

    public static void main(String[] args) {
        try {
            Method m = Student.class.getMethod("getInfo");
            Method s=Student.class.getMethod("getdata");
            Annotation an = (Annotation) m.getAnnotation(Annotation.class);
            Annotation as = (Annotation) s.getAnnotation(Annotation.class);
            if (an != null) {
                System.out.println("name :" + an.name());
                System.out.println("location :" + an.location());
                System.out.println("........................");
            }
            System.out.println(as.name());
            System.out.println(as.location());
        }
            catch (NoSuchMethodException e)
            {
                System.out.println("no such method exception");

            }



        }
    }


