import java.util.Scanner;
public class stringvalidation{
    public static void main(String[] args){
        int countand=0;
        int counthas=0;
        Scanner sc=new Scanner(System.in);
        String str=sc.nextLine();
            if(str.contains("&") && str.contains("#") && str.length()%2==0 ){
                System.out.println("yes");
            }else {
                System.out.println("no");
            }

            for (int i = 0; i < str.length(); i++) {
                if(str.charAt(i)=='&'){
                    countand++;
                }
                if(str.charAt(i)=='#'){
                counthas++;
                }
            }
            System.out.println(countand);
             System.out.println(counthas);

             

        }
    }
