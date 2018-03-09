package com.amir.first ;

import java.util.Scanner;

public class Area {
    public static void main (String[] args){
        int l,w,volume,perimeter,area ; 
        Scanner s = new Scanner(System.in);
        System.out.println("Enter the value of length: ");
        l = s.nextInt();
        System.out.println("Enter the value of width: ");
        w = s.nextInt();
        area = l * w;
        System.out.println("Area of rectangle is : " + area);
            area = l * l ;
            System.out.println("Area of Square is : " +area);
            volume = l * l * l ;
            System.out.println("Volume of cube is : " +volume);
            perimeter = 4 * l ;
            System.out.println("Perimeter of Square is : " +perimeter);
            perimeter = 2*l + 2*w ;
            System.out.println("Perimeter of Rectangle is : " +perimeter);
            s.close();
    }

}