package com.company;

import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
       Scanner in = new Scanner(System.in);
        int x = in.nextInt();
        if(x <= 3) System.out.println(Math.pow(x,2) - 3*x + 9);
        else System.out.println(1/(Math.pow(x,3)+6));
    }
}
