import java.util.*;
public class binary_conversion{
public static int bin_dec(int n) {
   int pow=0;
    int decimal=0;
    while(n>0){
    int LD=n%10;
    decimal=decimal+(LD *(int) Math.pow(2, pow));
    pow++;
    n=n/10;
    }
    return decimal;
}

public static void main(String[] args) {
    Scanner sc=new Scanner(System.in);
    System.out.print("ENTER THE NUMBER=");
    int n=sc.nextInt();
    System.out.println("decimal expression of the number will be: " + bin_dec(n));
}
}