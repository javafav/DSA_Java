package src;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Comparator;
import java.util.List;

public class PrintAlDivisors {
    public static void main(String[] args) {
allDivisors(36);
    }
    static List<Integer> allDivisors(int number){
        List<Integer> allDivisor = new ArrayList<>();
        for(int i = 1; i * i <= number ; i++){ // replacement of  Math.sqrt(number)
            if(number % i == 0){
                allDivisor.add(i);
                if((number / i) != i ){
                    allDivisor.add( number / i);
                }
            }
        }
        allDivisor.sort(Integer::compareTo);
        System.out.println(allDivisor);
        return allDivisor;
    }
}
