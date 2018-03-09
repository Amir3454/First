package com.amir.first;

import java.util.Scanner;

public class Interest {
    public static void main (String [] args){
        int p,t,r,SI ;
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the principle :");
        p = sc.nextInt();
        System.out.println("Enter the time :");
        t = sc.nextInt();
        System.out.println("Enter the Rate :");
        r = sc.nextInt();
            SI=p*t*r/100 ;
        System.out.println("THE SIMPLE INTEREST IS : " +SI);
        sc.close();
    }
}