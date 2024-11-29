package src;

import java.util.Scanner;

public class PkrToUsd {
    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.print("Please enter currency in Pkr: ");
        int pkr = scanner.nextInt();

        double pkrToUsd = pkr * 0.0036;
        System.out.println("Pkr "+ pkr + " = " + pkrToUsd + " Usd");

    }
}
