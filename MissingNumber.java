
public class MissingNumber {

    public static int findMissingNumber(int[] arr) {
        int n = arr.length + 1;
        int sum = n * (n + 1) / 2;
        for (int num : arr)
            sum = sum - num;
        return sum;
    }
    
    public static void main(String[] args) {
        int[] arr = {2,4,1,8,6,3,7};
        int missing = findMissingNumber(arr);
        System.out.println("missing number is "+missing);
    }
}
