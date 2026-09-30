public class star_pattern2{
    public static void main(String args[]) {
        for (int line=1;line<=4;line++){
            //INNER LOOOP PRINT THE CONDITON OF OUTER LOOP
            for (int star=1;star<=4-line+1;star++){    //(N-LINE+1)
                System.out.print("*");
            }
            System.out.println();
        }
    }
}