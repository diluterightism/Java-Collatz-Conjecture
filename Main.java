package com.work;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

        /*
        How it works
        -> If the number is even, then divide by 2
        -> If the number is odd, multiply it by 3 and add 1
         */

        Scanner sc = new Scanner(System.in); //Taking input for number
        System.out.print("Number: ");
        long num = sc.nextLong(); //Storing number

        int steps=0;
        while(num!=1) //Run as long as number is not 1
        {
            if(num%2==0) //If even divide by 2
            {
                num/=2;
                steps++;
            }
            else{
                num=num*3+1; //If odd multiply by 3 and 1
                steps++;
            }
        }
        System.out.println("Number of steps required: " + steps);
    }
}
