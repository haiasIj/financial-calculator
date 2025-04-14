package com.pluralsight;

import java.util.Scanner;

public class App {

    public static void main(String[] args) {

        Scanner scanner = new Scanner(System.in);

            System.out.print("enter loan amount:");
                float loan = scanner.nextFloat();
            System.out.print("enter interest rate:");
                float interest = scanner.nextFloat();
            System.out.print("How many years?:");
                float years = scanner.nextFloat();



            String choice =scanner.next();
                float result = loan * interest * years ;
            System.out.printf("%.2f * %.2f * %f = %.2f\n",loan,interest, years, result);

            System.out.println("A" loan "loan at" interest "interest for" years "years would be" result "in total");
            //Works w out final print

    }
}
