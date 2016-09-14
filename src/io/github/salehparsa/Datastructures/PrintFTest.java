package io.github.salehparsa.Datastructures;

import java.util.Scanner;

/**
 * Created by saleh on 9/14/16.
 */
public class PrintFTest {
    public void PrintFTest(){
        Scanner sc = new Scanner(System.in);
        System.out.println("================================");
        for (int i = 0; i < 3; i++) {
            String s1 = sc.next();
            int x = sc.nextInt();
            System.out.printf("%-14s %03d %n", s1, x);
            // %-14s left-justified from o to 14 for string
            // %03d padded with leading zero for int
        }
        System.out.println("================================");
    }
}
