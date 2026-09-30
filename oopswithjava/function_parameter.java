import java.util.*;
public class function_parameter{
    public static int  calculatesum(int num1,int num2) {
        int sum=num1+num2;
        System.out.println("sum is" + sum);
        return sum;
    }

    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
       int c= calculatesum(a,b);    //calculatesum function is performing its defined function on variable a and b
        //HERE TWO SUM VARIABLE ARE USED BUT BOTH ARE DIFFERNT DUE TO DIFFERENT USED IN DIFFERENT FUNCTION
        System.out.println("sum :"+ c);
    }
}