public class character_pattern{
    public static void main(String args[]) {
        char ch= 'A';
        for (int line=1;line<=4;line++){
            //INNER LOOOP PRINT THE CONDITON OF OUTER LOOP
            for (int chars=1;chars<=line;chars++){
                System.out.print(ch);
                ch++;
            }
            System.out.println();
        }
    }
}