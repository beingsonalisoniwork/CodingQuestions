package practice;
import java.util.Scanner;

// Ques: Write a java method that takes an array of integers and returns the first non-repeating element in the array.
// If all elements repeat, return -1.
// Example: input = [4, 5, 1, 2, 0, 4, 5, 2];
// output = 1

class FirstNonRepeatingElement {
    public static void main(String[] args) {
        // Scanner scn = new Scanner(System.in);
        // System.out.println("Enter the size of array: ");
        // int size = scn.nextInt();
        // int[] arr = new int[size];
        // System.out.println("Enter the elements of array.");
        // for(int i = 0; i < size; i++) {
        //     System.out.println("Enter element " + (i+1) + ": ");
        //     arr[i] = scn.nextInt();
        // }

        int[] arr = {4, 5, 1, 2, 0, 4, 5, 2};

        int num = findFirstNonRepeatitiveElement(arr);
        System.out.println(num);

        // scn.close();
    }

    public static int findFirstNonRepeatitiveElement(int[] arr) {
        for(int i = 0; i < arr.length; i++) {
            boolean isRepeated = false;
            // for(int j = 0; j < arr.length; j++) {
            //     if(i != j  && arr[i] == arr[j]) {
            //         isRepeated = true;
            //         break;
            //     }
            // }
            for(int j = i+1; j < arr.length; j++) {
                if(arr[i] == arr[j]) {
                    isRepeated = true;
                    break;
                }
            }
            if(!isRepeated) {
                return arr[i];
            }
        }
        // no non-repeating elements found
        return -1;
    }
}