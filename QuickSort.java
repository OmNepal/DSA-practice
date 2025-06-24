public class QuickSort {
    public static void main(String[] args) {
        int[] nums = {4, 2, 7, 9, 3, 0, 6, 23, 17, 12, 99, 43};

        System.out.println("Before sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
        System.out.println();

        quickSort(nums, 0, nums.length - 1);

        System.out.println("After sorting: ");
        for (int num : nums) {
            System.out.print(num + " ");
        }
    }

    static void quickSort(int[] nums, int lowIndex, int highIndex) { //this method keeps calling itself recursively leading to large depth and then backtracks after it's done

        if ( lowIndex < highIndex) {
            int pivotIndex = partition(nums, lowIndex, highIndex); //based on the index received from partition function, the array gets divided into sub arrays
            quickSort(nums, lowIndex, pivotIndex - 1); //left side sorting
            quickSort(nums,  pivotIndex + 1, highIndex);//right side sorting
        }

    }

    //method for partitioning the array such that elements smaller than pivot are to the left and larger are to the right
    static int partition(int[] nums, int lowIndex, int highIndex) {
        int pivot = nums[highIndex];
        int i = lowIndex - 1;

        //loop for comparing each value to the pivot and swapping when required
        for (int j = lowIndex; j < highIndex; j++) {
            if (nums[j] < pivot) {
                i++;
                int temp = nums[i];
                nums[i] = nums[j];
                nums[j] = temp;
            }
        }
        i++;
        nums[highIndex] = nums[i];
        nums[i] = pivot; //swapping pivot to its correct position

        return i; //returning the pivot index for the quicksort function to use and divide the array and call itself
    }
}
