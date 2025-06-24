public class InsertionSort {
    public static void main(String[] args) {
        int[] nums = {6, 3, 1, 9, 2, 7};
        int n = nums.length;
        int value;
        int j;

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 1; i < n; i++) {
            value = nums[i];
            j = i-1;
            while ( j >= 0 && (value < nums [j])) {
                nums[j + 1] = nums[j];
                j--;
            }
            nums[j + 1] = value;

            for (int num : nums) {
                System.out.print(num + " ");
            }
            System.out.println();

        }

        System.out.println("after sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}
