import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class TwoSumProblem {

    public int[] twoSum(int[] numbers, int target) {
        int[] result = new int[2];
        Map map = new HashMap();
        for (int i = 0; i < numbers.length; i++) {
            if (!map.containsKey(target - numbers[i])) {
                map.put(numbers[i], i);
            } else {
                result[1] = i;
                result[0] = (int) map.get(target - numbers[i]);
                return result;
            }
        }
        return result;
    }

    public int[] twoSumApproach2(int[] arr, int target) {
        Arrays.sort(arr);
        int left = 0;
        int right = arr.length - 1;
        int[] result = new int[2];
        while (left < right) {
            int sum = arr[left] + arr[right];
            if (sum == target) {
                result[0] = arr[left];
                result[1] = arr[right];
                return result;
            } else if (sum < target) {// increases the sum as sum is less than target
                left++;
            } else {
                right--;
            }
        }
        return new int[0];
    }

    public static void main(String[] args) {
        TwoSumProblem two = new TwoSumProblem();
        int[] arr = { 2, 11, 5, 10, 7, 8 };
        int[] res = two.twoSumApproach2(arr, 9);
        if (res == null)
            System.out.println("not found");
        for (int i = 0; i < res.length; i++)
            System.out.print(res[i] + " ");
    }
}
