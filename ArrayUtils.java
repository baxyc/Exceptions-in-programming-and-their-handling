public class ArrayUtils {
    public static int[] arrayDiff(int[] arr1, int[] arr2) {
        if (arr1.length != arr2.length) {
            System.out.println("Длины массивов не равны!");
            return null;
        }
        int[] diff = new int[arr1.length];
        for (int i = 0; i < arr1.length; i++) {
            diff[i] = arr1[i] - arr2[i];
        }
        return diff;
    }
}
