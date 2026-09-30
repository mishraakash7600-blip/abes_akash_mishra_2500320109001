public class butterfly_pattern{
    public static void main(String[] args) {
        //1st half
        for (int i = 1; i <=4; i++) {
            //for start - i
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //for space- 2*(4-i)
            for (int j = 1; j <=2*(4-i); j++) {
                System.out.print(" ");
            }
             //for star- i
              for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }

        //2nd half - mirror of 1st half
         for (int i = 4; i >=1; i--) {                     //reverse loop for mirroring
        
            //for start - i
            for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            //for space- 2*(4-i)
            for (int j = 1; j <=2*(4-i); j++) {
                System.out.print(" ");
            }
             //for star- i
              for (int j = 1; j <=i; j++) {
                System.out.print("*");
            }
            System.out.println();
        }


    }
}