/*
Programming Exercise 7.21
*/

import java.util.Scanner;

public class Exercise07_21 {
    public static void main (String [] args){
        int sum=0;

        for(int i=0; i< args.length; i++){
            sum+= Integer.parseInt(args[i]);
        }

        System.out.println("Sum of numbers: " +sum);
    }
}
