import java.util.*;

class SumOfTwo {
    public static void main(String[] args) {
        int[] arr = {10, 15, 3, 7};
        int target = 17;
        int[] arr2 = {12, 6, 4, 9, 10, 16, 9};
        int target2 = 20;
        int[] arr3 = {1, 12, 20, 7};
        int target3 = 3;

        System.out.println(findPair(arr, target));
        System.out.println(findPair(arr2, target2));
        System.out.println(findPair(arr3, target3));
    }

    public static boolean findPair(int[] arr, int target) {
        Map<Integer, Integer> numMap = new HashMap<>();

        for (int i = 0; i < arr.length; i++) {
            int temp = target - arr[i];
            if (numMap.containsKey(temp)) {
                return true;
            }
            else {
                numMap.put(arr[i], i);
            }
        }

        return false;
    }
}