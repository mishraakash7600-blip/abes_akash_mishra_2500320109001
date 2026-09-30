
import java.util.Scanner;

public class reverse_array{
    public static void reverse(int number[]) {
        int start=0;                 int end=number.length-1;       //TWO POINTER APPROACH
           

        while(start< end){
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;
            start++;
            end--;

        }
    }

     public static void input_reverse(int number[],int a) {
        int start=0;                 int end=number.length-1;       //TWO POINTER APPROACH
           

        while(start< end){
            int temp=number[end];
            number[end]=number[start];
            number[start]=temp;
            start++;
            end--;

        }
    }

    // public static void input_rev(int[]number,int a) {
    //     for (int i = number.length-1; i < a; i--) {
    //         System.out.println(number[i]);
    //     }
        
    // }
    public static void main(String[] args) {
        
        Scanner sc=new Scanner(System.in);
       int number[]={1,2,3,4,5,6,7};
       System.out.print(" PREVIOUS ARRAY: ");
       for (int i = 0; i < number.length; i++) {
            System.out.print(number[i]+" ");
       }
       System.out.println();
        System.out.println("enter the number of element from last= ");
        int a=sc.nextInt();
        //  reverse(number);

        System.out.print("REVERSED ARRAY: ");
       for (int i = 0; i < number.length; i++) {
           System.out.print(number[i]+" ");
       }
    }
}