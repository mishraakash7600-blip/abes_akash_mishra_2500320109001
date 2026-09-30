import java.util.Scanner;
public class overloading_datatype{   //using datatype
    public static int sum(int a,int b) {
        return a+b;
    }

        public static float sum(float a,float b) {
        return a+b;
    }
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int a=sc.nextInt();
        int b=sc.nextInt();
        System.out.println(sum(a, b));
        float A=sc.nextFloat();
        float B=sc.nextFloat();
        System.out.println(sum(A,B));
        

    }
}