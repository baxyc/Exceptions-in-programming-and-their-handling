import java.util.Arrays;

public class ArrayDiff {
    public static void main(String[] args) {
        int[] arr1 = {1, 2, 3};
        int[] arr2 = {4, 5, 6};
        int[] diff = ArrayUtils.arrayDiff(arr1, arr2);
        if (diff != null) {
            System.out.println(Arrays.toString(diff)); // [-3, -3, -3]
        }
    }
}
