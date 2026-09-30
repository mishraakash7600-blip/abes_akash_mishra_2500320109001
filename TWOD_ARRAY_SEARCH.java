import java.util.*;
public class TWOD_ARRAY_SEARCH{
    public static boolean staircase_search(int key,int[][] nums) {
        int row=0,col=nums[0].length-1;
        while((row <nums.length) && (col >= 0) ){
            if (nums[row][col]==key){
                System.out.println("key found at "+ row+"th row and " + col +"th column");
                return true;
            }else if(key< nums[row][col]){
                col--;
            }else{
                row++;
            }
        }
        System.out.println("key is not found");
        return false;
    }

    public static boolean REVERSE_staircase_search(int key,int[][] nums) {
        int row=nums.length-1,col=0;
        while((col <nums.length) && (row >= 0) ){
            if (nums[row][col]==key){
                System.out.println("key found at "+ row+"th row and " + col +"th column");
                return true;
            }else if(key< nums[row][col]){
                row--;
            }else{
                col++;
            }
        }
        System.out.println("key is not found");
        return false;
    }

    public static boolean searchAS_1d_ARRAY(int[][] matrix, int target, int midrow) {
        int start = 0;
        int end = matrix[0].length - 1;

        while (start <= end) {
            int mid = start + (end - start) / 2;

            if (matrix[midrow][mid] == target)
                return true;
            else if (matrix[midrow][mid] < target)
                start = mid + 1;
            else
                end = mid - 1;
        }

        return false;
    }

    public static boolean searchMatrix(int[][] matrix, int target) {
        int startrow = 0;
        int endrow = matrix.length - 1;
        int n = matrix[0].length;

        while (startrow <= endrow) {
            int midrow = startrow + (endrow - startrow) / 2;

            if (target >= matrix[midrow][0] && target <= matrix[midrow][n - 1])
                return searchAS_1d_ARRAY(matrix, target, midrow);

            else if (target > matrix[midrow][n - 1])
                startrow = midrow + 1;

            else
                endrow = midrow - 1;
        }

        return false;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE KEY VALUE= ");
        int key = sc.nextInt();
        int nums[][]={{1,2,3,4},
                       {5,6,7,8},
                       {9,10,11,12},
                       {13,14,15,16}};

        staircase_search(key, nums);
        REVERSE_staircase_search(key, nums);

        searchMatrix(nums, key);  //CALLING THE BINARY SEARCH APPROACH
                       
    }
}