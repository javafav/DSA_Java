package src;

public class ReverseNumbers {
    public static void main(String[] args) {
        System.out.println(reverseNumber(1041));
    }
    static int reverseNumber(int number){
        if(number > 0 && number < 10){
            return number;
        }
        int reverseNumber = 0;
        while (number > 0){
            int lastDigit = number % 10;
            reverseNumber = (reverseNumber * 10) + lastDigit;
            number = number / 10;

        }

        return  reverseNumber;

    }
}
