import java.util.*;
public class binomial{
    public static int bincoff(int n){
        int fact=1;
        for(int i=1;i<=n;i++){
            fact*=i;
        }
         return fact;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
System.out.print("enter the number n:");
        int n=sc.nextInt();
        int n_factorial=bincoff(n);
System.out.println("FACTORIAL OF THE NUMBER n :"+n_factorial);

System.out.print("ENTER THE NUMBER r:");
int r=sc.nextInt();
int r_factorial=bincoff(r);
System.out.println("factorial of the number r:"+ r_factorial);


int a=n-r;
int diff_factorial=bincoff(a);
System.out.println("factorial of the number n-r:"+ diff_factorial);



int fin=n_factorial/(r_factorial*diff_factorial);
System.out.print("the binomial coefficient will be"+ fin);
}
}




// import java.util.Scanner;
// public class array{
//     public static int bino(int n) {
//        int factn=1;
//         for (int i = 1; i <= n; i++) {
//             factn*=i;
//         }
//        // System.out.println("factorial="+factn);
//      return factn;

//     }
//     public static void main(String[] args) {
//         Scanner sc =new Scanner(System.in);
//         int n=sc.nextInt();
//        int factn= bino(n);

//         int r=sc.nextInt();
//        int factr= bino(r);

//         int v=n-r;
//         int factv=bino(v);

//         int c=factn/(factr*factv);

//         System.out.println("Binomial Coefficient will be= "+ c );
//     }
// }




// import java.util.Scanner;
// public class array{
//     public static int bino(int n) {
//        int f=1;
//         for (int i = 1; i <= n; i++) {
//             f*=i;
//         }
//      return f;
//     }
// public static int bincoff(int n,int r) {
//     int fact_n=bino(n);
//     int fact_r=bino(r);
//     int fact_n_r=bino(n-r);
    
//     int final_answer=fact_n/(fact_r*fact_n_r);
//     System.out.println("binomial coefficient will be:"+final_answer);
//     return final_answer;
// }

// public static void main(String[] args) {
//     Scanner sc=new Scanner(System.in);
//     int n=sc.nextInt();
//     int r=sc.nextInt();
//       System.out.println(bincoff(n, r));
// }
// }