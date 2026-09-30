public class half_pyramid_pattern{
    public static void main(String args[]) {
        for (int line=1;line<=4;line++){
        int a=5;

            //INNER LOOOP PRINT THE CONDITON OF OUTER LOOP
            for (int star=1;star<=line;star++){
                System.out.print(a);
                a++;
            
            }
            System.out.println();
        }
    }
}