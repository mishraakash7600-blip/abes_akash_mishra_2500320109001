public class rhombus_pattern{
    public static void main(String[] args) {
        for (int i = 1; i <= 5; i++) {
            // for space- n-i
            for (int j = 1; j <= (5-i); j++) {
                System.out.print(" ");
            }
            // for star - i=5
            for (int j = 1; j <= 5; j++) {
                System.out.print("*");
            }
            System.out.println();
        }
    }
}