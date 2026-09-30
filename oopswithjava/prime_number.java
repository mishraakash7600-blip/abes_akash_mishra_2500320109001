
import java.util.Scanner;

public class prime_number{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
      //PRIME NUMBER OR NOT??????WITHOUT BOOLEAN
   System.out.print("ENTER THE NUMBER:");
     int number=sc.nextInt();
     int A=1;
     int counter=0;
     while(A<=number){
        if (number%A==0){
        counter++;    
        }
        A++;
     }
     if (counter==2){
     System.out.println(number+" IT IS A PRIME NUMBER");
     }
     else {
        System.out.println(number+" IT IS NOT A PRIME NUMBER");
     }




     // PRIME NUMBER OR NOT??????
//    System.out.print("ENTER THE NUMBER:");
//      int number=sc.nextInt();
//      int A=2;
//      Boolean is=true;
//      while(A<=number-1){
//         if (number%A==0){//MEANS NUMBER IS A MULTIPLE OF A WHICH IS NOT 1 OR NUMBER ITSELF
//             System.out.println("IT IS NOT A PRIME NUMBER,IT IS A COMPOSITE NUMBER");
//             is=false;            
//             break;
//         }
//         A++;

//      }

//      if(is){
//         System.out.println("iss prime ");

//      }
//      else{
//         System.out.println("not prime5");
//      }

  
    }
}