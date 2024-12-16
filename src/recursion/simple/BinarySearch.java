package src.recursion.simple;

public class BinarySearch {
    public static void main(String[] args) {
        int[] numbers = {1, 2, 5, 9, 11, 47};
        int target = 7;
        int foundNumber = findNumber(numbers, target, 0, numbers.length - 1);
        if (foundNumber > 0) {
            System.out.println(target + " Number found at index " + foundNumber);
        } else {
            System.out.println(target + " Number not found. ");
        }


    }

    static int findNumber(int[] numbers, int target, int left, int right) {
        if (left > right) {
            return -1;
        }
        int mid = (left + right - left) / 2;
        if (target == numbers[mid]) {
            return target;
        }else if(target< numbers[mid]){
            return findNumber(numbers, target, left, mid - 1);
        }else {
            return findNumber(numbers, target, mid + 1, right);
        }

    }

}

