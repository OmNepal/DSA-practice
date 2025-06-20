public class LinearAndBinarySearch {
    public static void main(String[] args) {
        int[] nums = {1, 2, 3, 5, 7, 9, 11, 13, 14, 15, 16, 17, 19, 21, 22, 23, 27};
        int target = 15;

        int linearResult = linearSearch(nums, target);
        int binaryResult = binarySearch(nums, target);

        if (linearResult != -1) {
            System.out.println("Linear Search! Element found at index: " + linearResult);
        } else {
            System.out.println("Element not found!");
        }

        if (binaryResult != -1) {
            System.out.println("Binary Search! Element found at index: " + binaryResult);
        } else {
            System.out.println("Element not found!");
        }

    }

    private static int binarySearch(int[] nums, int target) {
        int start = 0;
        int end = nums.length - 1;

        int steps = 0;

        while (start <= end) {
            steps++;
            int middle = (start+end) / 2;

            if (nums[middle] == target) {
                System.out.println("Binary no of steps: " + steps);
                return middle;
            } else if (nums[middle] < target) {
                start = middle + 1;
            } else if (nums[middle] > target) {
                end = middle -1;
            }
        }
        System.out.println("Binary no of steps: " + steps);
        return -1;
    }

    public static int linearSearch(int[] nums, int target) {
        int steps = 0;
        for (int i = 0; i < nums.length; i++) {
            steps++;
            if(nums[i] == target) {
                System.out.println("Linear number of steps: " + steps);
                return i;
            }
        }
        System.out.println("Linear number of steps: " + steps);
        return -1;
    }


}
