public class inverted_triangle{
    public static void main(String[] args) {
        // int row=4;
        // int col=4;
        // for(int i=0;i<row;i++){
        //     for(int j=0;j<col-i;j++){
        //         System.out.print(" ");
        //     }

        //     for(int k=0;k<=i;k++){
        //         System.out.print("*");
        //     }
        //     System.out.println("");

        // }


        // int row=4;
        // int col=4;
        // for (int i = 0; i <= row; i++){
        //     for (int j= 0; j <col-i; j++) {
        //         System.out.print(" ");
        //     }
        //    for (int star = 0; star < i; star++) {
        //        System.out.print("*");
        //    }
        //    System.out.println(" ");
        // }



        int row =5;
        for (int i = 1; i <=row ; i++) {
            int number=1;
            for (int j= 1; j <= 5-i+1; j++) {
                
                System.out.print(number);
                number++;
            }
            System.out.println();
        }


        // int row=4;
        // int col=5;
        // for (int i = 0; i < row; i++) {
        //     for (int j= 0; j <col; j++) {
        //         if (i==0||i==3||j==0 ||j==4){
        //             System.out.print("*");
        //         }
        //         else{
        //             System.out.print(" ");
        //         }
        //     }
        //         System.out.println();
        // }


        // int row =4;
        // int col=4;
        // for (int i = 1; i <= row; i++){
        //     for (int j= 1; j <= col-i; j++) {
        //         System.out.print(" ");
                
        //     }
        //     for (int k = 0; k < i; k++) {
        //         System.out.print("*");
        //     }
        //     System.out.println();
        // }
    }
}
   