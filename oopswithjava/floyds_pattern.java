public class floyds_pattern{
    public static void main(String[] args) {
        int row=4;
        int number=1;
        //  int col=4;
        //  for (int i = 0; i < row; i++) {
            
        //     for (int j = 0; j < col; j++) {
        //        System.out.print(number);
        //        System.out.print(" "); 
        //        number++;
        //     }
            
        //     System.out.println();
        // }


         for (int i = 1; i <= row; i++) {
            for (int j = 1; j <= i; j++) {
                System.out.print(number);
                System.out.print(" ");
                number++;
            }
            System.out.println();
    }
}
}