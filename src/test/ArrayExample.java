package test;

import java.util.Arrays;
import java.util.StringTokenizer;

public class ArrayExample {

    public static void main(String[] args) {
        int a[] = {3, 4, 6, 1, 29, 4};
        Arrays.sort(a);
        for (int i = 0; i < a.length; i++) {
            System.out.print(" " + a[i]);
        }
        System.out.println("Element is at " + Arrays.binarySearch(a, 3) + " Position");

        String x = "he,ll,o";
        char[] ch = x.toCharArray();
        for (char o : ch) {
            System.out.println(o);
        }

        StringTokenizer s1 = new StringTokenizer(x, ",");
        while (s1.hasMoreTokens()) {

            System.out.println(s1.nextToken());

        }
    }





}
