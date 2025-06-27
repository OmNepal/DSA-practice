public class MergeSort {
    public static void main(String[] args) {
        int arr[] = {1, 4, 3, 6, 5, 2};

        System.out.println("before sorting");
        for (int a : arr) {
            System.out.print(a + " ");
        }
        System.out.println();

        mergeSort(arr, 0, arr.length-1);

        System.out.println("after sorting");
        for (int a : arr) {
            System.out.print(a + " ");
        }
    }

    private static void mergeSort(int[] arr, int l, int r) {
        if (l < r) {
            int mid = l + (r - l) / 2;

            mergeSort(arr, l, mid);
            mergeSort(arr, mid + 1, r);

            merge(arr, l, mid, r);
        }

    }

    private static void merge(int[] arr, int l, int mid, int r) {
        int l1 = mid - l + 1;
        int r1 = r - mid;

        int lArr[] = new int[l1];
        int rArr[] = new int[r1];

        int i = 0;
        int j = 0;

        int k = l;

        for (int a = 0; a < l1; a++) {
            lArr[a] = arr[l + a];
        }

        for (int b = 0; b < r1 ; b++) {
            rArr[b] = arr[mid + 1 + b];
        }


        while (i < l1 && j < r1) {
            if (lArr[i] <= rArr[j]) {
                arr[k] = lArr[i];
                i++;
            } else {
                arr[k] = rArr[j];
                j++;
            }
            k++;
        }

        while (i < l1) {
            arr[k] = lArr[i];
            i++;
            k++;
        }
        while (j < r1) {
            arr[k] = rArr[j];
            j++;
            k++;
        }

    }
}
