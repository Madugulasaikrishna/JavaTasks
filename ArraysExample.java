//program to remove duplicate elements
import java.util.Arrays;

public class ArraysExample {
    public static void main(String[] args) {
        int nums[] = {23, 30, 45, 68, 30, 20, 48, 68};
        System.out.println("Original array length: " + nums.length);
        System.out.println();
        System.out.println("Array elements are:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
            
        }
        System.out.println();

        // Sort the array to bring duplicates together
        Arrays.sort(nums);
        System.out.println("\nSorted array elements are:");
        for (int i = 0; i < nums.length; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();

        int newLength = array_sort(nums);
        System.out.println("\nThe new array length: " + newLength);
        System.out.println("Array elements after removing duplicates are:");
        for (int i = 0; i < newLength; i++) {
            System.out.print(nums[i] + " ");
        }
        System.out.println();
    }

    public static int array_sort(int[] nums) {
        if (nums.length == 0) return 0;
        int index = 1;
        for (int i = 1; i < nums.length; i++) {
            if (nums[i] != nums[index - 1]) {
                nums[index++] = nums[i];
            }
        }
        return index;
    }
}