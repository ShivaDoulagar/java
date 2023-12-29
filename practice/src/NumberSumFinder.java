import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.Scanner;

public class NumberSumFinder {
    public static List<List<Integer>> findNumberPairs(int[] numbers, int targetSum) {
        List<List<Integer>> result = new ArrayList<>();
        Map<Integer, Integer> map = new HashMap<>();

        for (int i = 0; i < numbers.length; i++) {
            int complement = targetSum - numbers[i];
            if (map.containsKey(complement)) {
                List<Integer> pair = new ArrayList<>();
                pair.add(numbers[i]);
                pair.add(complement);
                result.add(pair);
            }
            map.put(numbers[i], i);
        }

        return result;
    }

    public static void main(String[] args) {
        // int[] numbers = {2, 4, 6, 8, 10};
        // int targetSum = 12;
        System.out.println("program to find the sum from the key");
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of elements");
        int n = sc.nextInt();
        int[] numbers = new int[n];
        System.out.println("Enter the elements");
        for (int i=0;i<n;i++){
            numbers[i]=sc.nextInt();
        }
        System.out.println("The entered elements are");
        for (int i=0;i<n;i++){
            System.out.print("    "+numbers[i]);
        }
        System.out.println("\nEnter the key");
        int targetSum = sc.nextInt();

        List<List<Integer>> pairs = findNumberPairs(numbers, targetSum);

        if (pairs.isEmpty()) {
            System.out.println("No pairs found.");
        } else {
            System.out.println("Pairs found:");
            for (List<Integer> pair : pairs) {
                System.out.println(pair.get(0) + " + " + pair.get(1) + " = " + targetSum);
            }
        }
    }
}
