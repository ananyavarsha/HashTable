
public class SquaresOfSortedArray {

    public static void square(int[] arr) {
        int n = arr.length;
        int[] result = new int[n];
        int i = 0;
        int j = n - 1;
        for (int k = n - 1; k >= 0; k--) {
            if (Math.abs(arr[i]) > Math.abs(arr[j])) {
                result[k] = arr[i] * arr[i];
                i++;
            } else {
                result[k] = arr[j] * arr[j];
                j--;
            }
        }
        for (int num : result)
            System.out.print(num + " ");
    }

    public static void main(String[] args) {
        int[] arr = { -4, -1, 0, 3, 10 };
        square(arr);
    }
}
