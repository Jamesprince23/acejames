package review;

import java.util.Arrays;

public class Day2_1 {
    
    public static void main(String[] args) {
        int n = 2;
        float f = 5.0f;
     
        int []a = {2, 4, 6, 8, 10};
        System.out.println("Values of n and f before function call : "+n+", "+f);
        forPrimitive(n, f);
        System.out.println("Values of n and f after function call : "+n+", "+f);
        System.out.println("Array values before function call:"+Arrays.toString(a));
        forArray(a);
        System.out.println("Array values after function call:"+Arrays.toString(a));

    }

    public static void forPrimitive(int n, float f) {
        n += 10;
        f -= 2.5f;
    }

    public static void forArray(int []a) {
        for(int i=0; i<a.length; i++)
            a[i] += 2;
    }

}
