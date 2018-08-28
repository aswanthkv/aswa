package stream;

import java.util.regex.Pattern;

public class Regexpsn {
    public static void main(String[] args)
    {
        //boolean b=Pattern.matches("..b","abb");
        //System.out.println(b);

        System.out.println(Pattern.matches("[abc]","aaa"));//false bcoz input should have either a or b or c;
        System.out.println(Pattern.matches("[^abc]","z"));//not a or b or c hence true;
        System.out.println(Pattern.matches("[A-z a-z]","A"));
        System.out.println(Pattern.matches("[a-z]","a"));
        System.out.println(Pattern.matches("[a-d[m-p]]","n"));//this can be of the form [a-d][m-p]
        System.out.println(Pattern.matches("(0[1-9]|[12][0-9]|3[01])[/](0[1-9]|1[012])[/][0-9][0-9][0-9][0-9]","09/10/1926"));



    }


}





// x? = x occurs once or not at all;
//x+ =x 0ccurs once or more times;
//x* =x occurs 0 or more times;
//x{n}=x occurs n times only;
//x{n,}=x occurs n or more times;
//[abc]	a, b, or c (simple class)
//        2	[^abc]	Any character except a, b, or c (negation)
//        3	[a-zA-Z]	a through z or A through Z, inclusive (range)
//        4	[a-d[m-p]]	a through d, or m through p: [a-dm-p] (union)
//        5	[a-z&&[def]]	d, e, or f (intersection)
//        6	[a-z&&[^bc]]	a through z, except for b and c: [ad-z] (subtraction)
//        7	[a-z&&[^m-p]]	a through z, and not m through p: [a-lq-z](subtraction)
//
//


