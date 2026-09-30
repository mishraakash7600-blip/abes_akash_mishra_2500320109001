
import java.util.Scanner;
 
public class TWOD_ARRAY{
    public static boolean  search(int matrix[][], int key) {
         for (int i = 0; i < matrix.length ; i++) {
            for (int j = 0; j < matrix[0].length ; j++) {
             if(matrix[i][j]==key){
                System.out.println("key found at ("+i+","+j+")");
                 return true;
             }
         }
    }
    System.out.println("key not found");
    return false;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);

        // 2D ARRAY CREATION
        int matrix[][]= new int[3][3];
         System.out.println("ENTER THE ELEMENTS IN ARRAY: ");
         int n=matrix.length ; int m=matrix[0].length;

        // ELEMENT FROM USER
         for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
             matrix[i][j]= sc.nextInt();
         }
    }

    // OUTPUT
    for (int i = 0; i < n ; i++) {
            for (int j = 0; j < m ; j++) {
                System.out.print(matrix[i][j]+ " ");
         }
         System.out.println();
    }

    // SEARCHING
    System.out.print("ENTER THE KEY TO BE SEARCHED: ");
    int key =sc.nextInt();
    search(matrix, key);

}
}