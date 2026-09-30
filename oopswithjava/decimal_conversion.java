public class decimal_conversion{
    public static void dec_bin(int n) {
        int mynum=n;
      int binary=0;
       int pow=0;
       while(n>0){
          int rem=n%2;
          binary=binary+(rem* (int)Math.pow(10, pow));
          pow++;
          n=n/2;
       }
       System.out.println("binary coonversion of "+ mynum + "will be: "+ binary);
    }

    public static void main(String[] args) {
        System.out.print("ENTER THE BINARY DIGIT: ");
        dec_bin(5);
    }
}