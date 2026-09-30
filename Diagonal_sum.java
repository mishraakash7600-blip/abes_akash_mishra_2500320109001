public class Diagonal_sum{
    public static void diagonal_sum(int matrix[][]) {
        int primary_sum=0;
        int secondary_sum=0;

        // PRIMARY SUM
        for (int i = 0; i < matrix.length; i++) {         //ROW
            for (int j = 0; j < matrix[0].length; j++) {   //COLUMN
                if (i==j){
                    primary_sum+=matrix[i][j];
                }
            }
        }
        System.out.println("primary diagonal sum = "+ primary_sum);

        // SECONDARY SUM
        for (int i = 0; i < matrix.length; i++) {   //ROW
            for (int j = matrix[0].length ; j >=0; j--) {
                if(i+j==matrix.length-1){
                    secondary_sum+=matrix[i][j];
                }
            }
        }
        System.out.println("secondary diagonal sum = "+ secondary_sum);
    }
    public static void main(String[] args) {
        // matrix creation
        int matrix[][]={{1,2,3,4},{5,6,7,8},{9,10,11,12},{13,14,15,16}};
         
        // MATRIX DISPLAY
        for (int[] matrix1 : matrix) {
            for (int j = 0; j < matrix[0].length; j++) {
                System.out.print(matrix1[j] + " ");   
            }
            System.out.println();
        }
        diagonal_sum(matrix);
    }
}