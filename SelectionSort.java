public class SelectionSort {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 20, 30};
        int[] res = selectionSort(arr);
        for (int ele : res) {
            System.out.print(ele + " ");
        }

    }

    public static int[] selectionSort(int[] arr) {
        int n = arr.length;

        for (int i = 0; i < n - 1; i++) {
            int minIdx = i;
            for (int j = i + 1; j < n; j++) {
                if (arr[j] < arr[minIdx]) {
                    minIdx = j;
                }
            }

            int temp = arr[minIdx];
            arr[minIdx] = arr[i];
            arr[i] = temp;
        }
        return arr;
    }
}
