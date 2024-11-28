import java.util.Scanner;

public class IntersetRateCalculator {
    

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Please enter How much Amount you want to Test Bank");
        float principalAmount = scanner.nextFloat();
        System.out.println("Please enter the duration of the loan");
        int duration = scanner.nextInt();

        System.out.println("Please enter the interest rate");
        float rate = scanner.nextFloat();
        float simpleInterestRate = (principalAmount * rate * duration) / 100;
        System.out.println("Simple interest rate: " + simpleInterestRate);
        scanner.close();

    }

}
