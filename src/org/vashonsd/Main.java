package org.vashonsd;
import java.util.Scanner;

public class Main {

    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);

        System.out.println("How much money do you owe in dollar and cents?");
        double money = input.nextDouble();
        money /= 10;
        int billsOwed = (int) money + 1;
        System.out.println("You owe " + billsOwed + " ten dollar bills.");
        double change = (billsOwed * 10) - (money * 10);
        System.out.println("You will get $" + change + " back.");
    }
}
