import java.util.*;
public class factorial{
    public static int facto(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
         return fact;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
System.out.print("enter the number:");
        int n=sc.nextInt();
        int factorial=facto(n);
System.out.println("FACTORIAL OF THE NUMBER :"+factorial);

}
}