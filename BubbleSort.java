public class BubbleSort {
    public static void main(String[] args) {
        int[] arr = {10, 20, 40, 60, 20, 30};
        int[] res = bubbleSort(arr);
        for (int ele : res) {
            System.out.print(ele + " ");
        }

    }

    public static int[] bubbleSort(int[] arr) {
        int n = arr.length;
        boolean swap;
        for (int i = 0; i < n - 1; i++) {
            swap = false;
            for (int j = 0; j < n - 1 - i; j++) {
                if (arr[j] > arr[j + 1]) {
                    int temp = arr[j];
                    arr[j] = arr[j + 1];
                    arr[j + 1] = temp;
                    swap = true;
                }
                if (swap == false)
                    break;
            }
        }
        return arr;
    }
}
