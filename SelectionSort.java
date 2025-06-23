public class SelectionSort {
    public static void main(String[] args) {
        int[] nums = {1, 4, 5, 7, 2, 3};
        //int[] nums = {1, 2, 3, 4, 5, 6};
        int n = nums.length;
        int min;
        int tempI;

        System.out.println("Before sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        // Selection Sort for Ascending Order
        for (int i = 0; i < n - 1; i++) {
            min = nums[i];
            tempI = i;  // Start by assuming the current element is the smallest
            // Inner loop to find the minimum element in the unsorted portion
            for (int j = i + 1; j < n; j++) {
                if (nums[j] < min) {
                    min = nums[j];
                    tempI = j;  // Update the index of the minimum element
                }
            }

            // Swap the found minimum element with the first unsorted element
            int temp = nums[tempI];
            nums[tempI] = nums[i];
            nums[i] = temp;

            // Print the array after each pass
            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();
        }

        System.out.println("After sorting:");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
