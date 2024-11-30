package src;

public class CountDigit2 {
    public static void main(String[] args) {
        System.out.println(countDigit(12547));
    }
    static int countDigit(int number){
        return (int) Math.log10(number) + 1;
    }
}

