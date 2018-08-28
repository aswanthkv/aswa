package samples;

public class StringExample {

    void display(int a[])
    {
        for (int i=0;i<a.length;i++) {
            System.out.println(a[i]);
        }
    }

    public static void main(String[] args)
            {
               int[] d=new int[]{8,1,6,3,9};
               StringExample s=new StringExample();
               for (int i=0;i<d.length;i++)
               {
                   for (int j=i+1;j<d.length;j++)
                   {
                       if (d[i]>d[j])
                       {
                           int tmp=d[i];
                           d[i]=d[j];
                           d[j]=tmp;
                       }
                   }
               }
               s.display(d);


               int x[][]={{4,7,3,1},{2,9,1,3}};
               for (int k=0;k<x.length;k++)
               {
                   for (int i = 0; i <x[0].length; i++)
                   {
                       for (int j = i+1; j <x[0].length; j++)
                       {
                           if (x[k][i] > x[k][j]) {
                               int tmp = x[k][i];
                               x[k][i] = x[k][j];
                               x[k][j] = tmp;
                           }


                       }
                   }
               }

               for (int i=0;i<x.length;i++)
               {
                   for (int j=0;j<x[0].length;j++)
                   {
                       System.out.print(x[i][j]+" ");
                   }
                   System.out.println(" ");
               }
            }
        }


