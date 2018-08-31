package functinterface;

public class Genericfactory<T>   //here we have used generic type declaration for class name.
{

    Class<T> c;

    public Genericfactory(Class<T> c)
    {
        this.c=c;
    }

    public Class<T> getObjectType()
    {
        return c;
    }

    public T getObject() throws IllegalAccessException, InstantiationException
    {
        try {
            return (T) getObjectType().newInstance();
        } catch (InstantiationException e) {
            e.printStackTrace();
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return null;
    }

    public static void main(String[] args)  throws InstantiationException,IllegalAccessException{

        Genericexample p=new Genericfactory<Getset>(Getset.class).getObject();
        System.out.println(p.getName());

        p=new Genericfactory<oil>(oil.class).getObject();
        System.out.println(p.getName());

    }


}
