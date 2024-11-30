package src;

public class CountDigit3 {
    public static void main(String[] args) {
        System.out.println(countDigit(-100));
    }

    static int countDigit(int number){
       number = Math.abs(number);
        int count = 0;
        while (number >= 10){
            count++;
            number =  number / 10;
        }
        return count + 1;
    }
}
