import java.util.HashMap;

public class DegreeOfAnArray {

    public static int findShortestSubArray(int[] nums) {

        HashMap<Integer, Integer> count = new HashMap<>();
        HashMap<Integer, Integer> first = new HashMap<>();
        HashMap<Integer, Integer> last = new HashMap<>();

        for (int i = 0; i < nums.length; i++) {

            first.putIfAbsent(nums[i], i);

            last.put(nums[i], i);

            count.put(nums[i], count.getOrDefault(nums[i], 0) + 1);
        }

        int degree = 0;

        for (int freq : count.values()) {
            degree = Math.max(degree, freq);
        }

        int ans = nums.length;

        for (int key : count.keySet()) {

            if (count.get(key) == degree) {

                ans = Math.min(ans,
                        last.get(key) - first.get(key) + 1);
            }
        }

        return ans;
    }

    public static void main(String[] args) {

        int[] nums = {1,2,2,3,1};

        System.out.println("Input:");
        System.out.println("[1,2,2,3,1]");

        System.out.println("\nOutput:");
        System.out.println(findShortestSubArray(nums));
    }
}