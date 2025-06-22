public class BubbleSort {
    public static void main(String[] args) {
        int[] nums = {1, 7, 9, 2, 4, 3};
        int temp;

        System.out.println("before sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        for (int i = 0; i < nums.length - 1; i++) { //nums.length - 1 bcoz for every completion of loop, we get one element sorted, so after n-1 times, n-1 elements are sorted which means the remaining one element is also sorted.
            //System.out.println("steps i " + i);
            for (int j = 0; j < nums.length - i - 1; j++) { //since after every loop, last element is sorted so we don't need to check that element that's why we keep subtracting i each time
                //System.out.println("steps: " + j);
                if (nums[j] > nums[j+1]) {
                    temp = nums[j];
                    nums[j] = nums[j+1];
                    nums[j+1] = temp;
                }
            }

        }


        System.out.println("\nafter sorting");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }
}