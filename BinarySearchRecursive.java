import java.util.Scanner;

public class BinarySearchRecursive {

    // Recursive binary search method
    static int binarySearch(int[] arr, int low, int high, int key) {

        // Base case: element not found
        if (low > high) {
            return -1;
        }

        // Find the middle index
        int mid = low + (high - low) / 2;

        // If element is found
        if (arr[mid] == key) {
            return mid;
        }

        // Search in the left half
        if (key < arr[mid]) {
            return binarySearch(arr, low, mid - 1, key);
        }

        // Search in the right half
        return binarySearch(arr, mid + 1, high, key);
    }

    public static void main(String[] args) {

        Scanner sc = new Scanner(System.in);

        int[] arr = {2, 5, 8, 12, 16, 23, 38, 45, 56};

        System.out.print("Enter element to search: ");
        int key = sc.nextInt();

        int result = binarySearch(arr, 0, arr.length - 1, key);

        if (result != -1) {
            System.out.println("Element found at index " + result);
        } else {
            System.out.println("Element not found");
        }

        sc.close();
    }
}