/*
 *  UCF COP3330 Fall 2021 Assignment 12 Solution
 *  Copyright 2021 Christine Hawkins
 */
import java.util.Scanner;


public class Main {

    public static void main(String[] args) {

        Scanner input = new Scanner(System.in);

        System.out.println("Enter the principle:  ");
        double principle = input.nextDouble();
        System.out.println("Enter the rate of interest: ");
        double interest = input.nextDouble();
        System.out.println("Enter the number of years: ");
        int years = input.nextInt();

        double rate=interest/100;

        double equation1= (1+rate*years);
        double equation2= principle*equation1;

        System.out.println("After " +years+" years at " +interest+"%, the investment will be worth $" +equation2);
        
    }
}