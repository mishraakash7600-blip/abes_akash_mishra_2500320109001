public class Spiral_matrix{

    public static void spiral(int matrix[][]) {
        int startrow=0;
        int startcolumn=0;
        int endrow=matrix.length-1;
        int endcolumn=matrix[0].length-1;

        while(startrow<=endrow && startcolumn<=endcolumn){
            // TOP ELEMENT
            for (int j = startcolumn; j <=endcolumn; j++) {
                System.out.print(matrix[startrow][j]+" ");
            }
            // RIGHTMOST ELEMENTS
            for (int i = startrow+1; i<=endrow; i++) {
                System.out.print(matrix[i][endcolumn]+" ");
            }
            // BOTTOM ELEMENTS
            for (int j = endcolumn-1; j >= startcolumn; j--) {
                System.out.print(matrix[endrow][j]+" ");
            }
            // LEFTMOST ELEMENTS
            for (int i = endrow-1; i >=startrow+1; i--) {
                System.out.print( matrix[i][startcolumn]+" ");
            }

            startcolumn++;
            startrow++;
            endcolumn--;
            endrow--;

        }
        System.out.println();
        
    }
    public static void main(String[] args) {
        // spirak matrix creation
        int matrix[][]={{1,2,3,4,4,6,7,5,3,2,6,68},{5,6,7,8,5,7,8,43,7,8,4,66},{9,10,11,12,5,4,6,7,5,66},{13,14,15,16}};
         
        // MATRIX DISPLAY
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");   
            }
            System.out.println();
        }

        spiral(matrix);

    }
}




// class Solution {
//     public List<Integer> spiralOrder(int[][] matrix) {

//         List<Integer> ans = new ArrayList<>();

//         int startrow = 0;
//         int startcolumn = 0;
//         int endrow = matrix.length - 1;
//         int endcolumn = matrix[0].length - 1;

//         while (startrow <= endrow && startcolumn <= endcolumn) {

//             // Top row
//             for (int j = startcolumn; j <= endcolumn; j++)
//                 ans.add(matrix[startrow][j]);
//             startrow++;

//             // Right column
//             for (int i = startrow; i <= endrow; i++)
//                 ans.add(matrix[i][endcolumn]);
//             endcolumn--;

//             // Bottom row
//             if (startrow <= endrow) {
//                 for (int j = endcolumn; j >= startcolumn; j--)
//                     ans.add(matrix[endrow][j]);
//                 endrow--;
//             }

//             // Left column
//             if (startcolumn <= endcolumn) {
//                 for (int i = endrow; i >= startrow; i--)
//                     ans.add(matrix[i][startcolumn]);
//                 startcolumn++;
//             }
//         }

//         return ans;
//     }
// }