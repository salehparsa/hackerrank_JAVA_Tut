package io.github.salehparsa.Datastructures;

import java.util.Scanner;

/**
 * Created by saleh on 9/14/16.
 */
public class javaLoopII {
    public void javaLoopII(){
        Scanner in = new Scanner(System.in);
        int t=in.nextInt();
        for(int i=0;i<t;i++){
            int a = in.nextInt();
            int b = in.nextInt();
            int n = in.nextInt();
            int [] s =  new int [n];
            s[0] = a + b;
            System.out.print(s[0] +" ");
            for(int j=1; j < s.length; j++){
                double power = Math.pow(2, j);
                s[j]= (int)(s[j-1] + (power * b));
                System.out.print(s[j] + " ");
            }

            System.out.println();
        }
        in.close();
    }
}
