public class palindromic_number{
    public static void main(String[] args) {
        int i=0;
       while(i<=5) {
            for (int j = 1; j <= (5-i); j++) {
                System.out.print(" ");
            }
            for (int j = i; j >= 1; j--) {
                System.out.print(j);
            }
            for (int j = 2; j <= i; j++) {
                System.out.print(j);
            }
            System.out.println();
            i++;
        }
    }
}