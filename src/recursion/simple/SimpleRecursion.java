package src.recursion.simple;

public class SimpleRecursion {
   static  int count = 0;
    public static void main(String[] args) {
        printNumber();

    }

    static void printNumber(){
        if(count == 5) return;
        System.out.println(count);
        count++;
       printNumber();


    }
}
