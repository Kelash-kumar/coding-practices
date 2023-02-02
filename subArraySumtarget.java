import java.util.ArrayList;
import java.util.Scanner;

public class subArraySumtarget {

    public static ArrayList<Integer> subArraySum(int[] arr, int size, int sum) {
        ArrayList<Integer> subArraySum = new ArrayList<>();
        for (int i = 0; i < size; i++) {
            int s = 0;
            for (int j = i; j < size; j++) {
                s += arr[j];
                if (s == sum) {
                    System.out.println("The sum of Elemens form index " + (+1) + " position to " + (j + 1)
                            + " position is  " + sum);
                    while (i <= j) {
                        subArraySum.add(arr[i]);
                        i++;
                    }
                    return subArraySum;
                }
                if (s > sum) {
                    break;
                }

            }
        }
        return subArraySum;

    }

    public static void maxSumOfSubArray(int[] arr) {
        int sum = 0;

        for (int i : arr)
            sum += i;
        System.out.println("sum of array" + sum);
        System.out.println();
        for (int i = 0; i < arr.length; i++) {
            int subArraySum = 0;
            for (int j = i; j < arr.length; j++) {
                subArraySum += arr[j];

                if (subArraySum > sum) {
                    System.out.println("sum of sub array " + subArraySum);
                    return;
                }
            }
        }

    }

    public static void main(String[] args) {

        ArrayList<Integer> subArraySum = new ArrayList<>();
        int[] arr = { 1, 2, 3, 4, 5, 6, 7, -8, -9, -10 };
        maxSumOfSubArray(arr);
        System.out.println(subArraySum(arr, arr.length, 125));
        subArraySum = subArraySum(arr, arr.length, 12);
        for (int i : subArraySum)
            System.out.print(i + " ");

    }
}
