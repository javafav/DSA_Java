package src;

import java.util.Scanner;

public class Greetings {
    public static void main(String[] args) {
         Scanner  scanner = new Scanner(System.in);
        String name  = scanner.nextLine();
         System.out.println(name + "! welcome to Java "  );
         scanner.close();
    }

}
