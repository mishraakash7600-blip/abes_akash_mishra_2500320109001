import java.util.*;
public class function_product{
    public static int product(int a,int b){
       //System.out.println("product of the number="+a*b);
      int c= a*b;
         return c;
    }
public static void main(String[] args) {
   Scanner sc=new Scanner(System.in);
   System.out.print("ENTER A:");
        int a=sc.nextInt();
        System.out.print("ENTER B:");
        int b=sc.nextInt(); 
       int c= product(a, b);      //IT PASSES THE COPY OF FUNCTION PRODUCT IN MAIN FUNCTION
      //  int prod=product(10, 20);  //USING SAME FUNCTION ON DIFFERENT VALUES
     System.out.println(c);
}

    
}