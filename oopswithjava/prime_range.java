import java.util.Scanner;
public class prime_range{

     public static boolean isprime(int n) {
        boolean isprime=true;
        for (int i = 2; i < n;i++) {
           if(n%i==0){
            isprime=false;
           }
        }
        return isprime;
    }

    public static void primeinrange(int n) {
        for (int i =2 ; i < n; i++) {
            if(isprime(i)){
                // System.out.print(i+",");
            }
            
        }

    }
    
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        System.out.print("ENTER THE RANGE:");
        int n=sc.nextInt();
       primeinrange(n);
    }
}