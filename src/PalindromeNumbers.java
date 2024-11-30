package src;

public class PalindromeNumbers {
    public static void main(String[] args) {
        System.out.println(checkPalindromeNumbers(1401));
        System.out.println(checkPalindromeNumbers(1331));
    }
    static boolean checkPalindromeNumbers(int number){
        if(number > 0 && number < 10){
            return true;
        }
        int reverseNumber = 0;
        int tempNumber = number;

        while (number > 0){
            int lastDigitOfNumber = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigitOfNumber;
            number = number / 10;
        }
        System.out.println("reverse Number " + reverseNumber + " Original Number: " + tempNumber);
        if(tempNumber == reverseNumber){

            return true;
        }
        return false;
    }
}
