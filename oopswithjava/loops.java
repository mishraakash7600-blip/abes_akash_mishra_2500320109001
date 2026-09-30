import java.util.*;
public class loops{
    public static void main(String[] args) {
       Scanner sc =new Scanner(System.in);

         //MULTIPLICATION TABLE USING WHILE LOOP
         //  int i=sc.nextInt();
        // int n=sc.nextInt();
        //  while (i<=n){
        //     System.err.println(2*i);
        //     i++;
        //  }


       //SUM OF FIRST N NATURAL NUMBER
       //  int i=sc.nextInt();
        // int n=sc.nextInt();
    //    int sum=0;
    //     while (i<=n){
    //         sum=sum+i;
    //         i++;
    //      }
    //      System.out.println(sum);


    //FOR LOOPS

    // for(int i=0;i<10;i++){
    //     System.out.println("hello world");
    // }


        
        //PROGRAM TO PRINT THE REVERSE OF A NUMBER 
        
        System.out.print("ENTER THE NUMBER:");
        int n=sc.nextInt();
        int rev=0;

        while(n>0){
            int last_digit=n%10;
            rev=((rev*10)+last_digit);
            n=n/10;

        }

        System.out.println(rev);



        //HELLO WORLD BY DO_WHILE LOOPS
        // int i=1;
        // do { 
        //     if(i==3){
        //         break;
        //     }
        //     System.out.println("hello world");
        //     i++;
        // } while ();
          
        //   System.out.println("i am out of the loop");


        //ENTER THE NUMBER TILL IT IS MULTIPE OF 10
        
        // do { 
        //     System.out.println("ENTER YOUR NUMBER:");
        //     int n=sc.nextInt();
        //     if (n%10==0){
        //         System.out.println("code iss ended because it is a multiple of 10");
        //         break;
        //     }
        //     System.out.println(n);
        // } while (true);


       //display all the numbers entered by the user except if it is muliple of 10
       
    //    do { 
    //     System.out.print("ENTER THE NUMBER:");
    //    int n=sc.nextInt();
    //        if(n%10==0){
    //         System.out.println("code is ended because multiple of 10 is found");
    //         continue;
    //        }
    //        System.out.println("your number:"+n);
    //    } while (true);

   



 


        
    }
}