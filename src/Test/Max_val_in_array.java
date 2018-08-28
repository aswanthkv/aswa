package Test;

public class Max_val_in_array {


    public static void main(String[] args) {
        int b=0;
        int c=0;
        int a[]={23,45,67,66,28,94,81};
        int n=a.length;
        for (int i = 0; i <n; i++)
        {
            if(a[i]>b)
            {
                b=a[i];
            }
        }
        System.out.println("biggest element is "+b);
        int first=b;
        for(int j=0;j<n;j++)
        {
            if((a[j]>c)&&(a[j]!=first))
            {
                c=a[j];
            }
        }
        System.out.println("second largest is"+c);


    }
}
