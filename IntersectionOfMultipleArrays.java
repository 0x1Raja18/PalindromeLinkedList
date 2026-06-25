import java.util.*;

public class IntersectionOfMultipleArrays {

    public static List<Integer> intersection(int[][] nums) {

        int[] count = new int[1001];

        for (int[] arr : nums) {

            for (int num : arr) {
                count[num]++;
            }
        }

        List<Integer> result = new ArrayList<>();

        for (int i = 1; i <= 1000; i++) {

            if (count[i] == nums.length) {
                result.add(i);
            }
        }

        return result;
    }

    public static void main(String[] args) {

        int[][] nums = {
                {3, 1, 2, 4, 5},
                {1, 2, 3, 4},
                {3, 4, 5, 6}
        };

        System.out.println(intersection(nums));
    }
}