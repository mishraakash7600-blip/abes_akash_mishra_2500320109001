import java.util.Scanner;
public class string{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        //STRING CREATION
        String str="akash";
       String str2="yesh" ;  //STRINGS ARE IMMUTABLE

       System.out.print("ENTER THE NAME: ");
       String str3=sc.nextLine();
       System.out.println("MY NAME IS "+str3);

    //    STRING FUNCTION:
    System.out.println(str.length());  //count the number of character in a string(including spaces)- length()

    String CON=str + " "+ str2; //ADD TO different string- concatenation
    System.out.println(CON);

    System.out.println(CON.charAt(6)); //give the character stored at the following index-chatAT()
    for (int i = 0; i < CON.length(); i++) {
        System.out.println(CON.charAt(i));
    }


    // comparison using .equals() methods- it compares their character valus are equal or not 
   // comparison using .CompareTO() methods- it compares their ascii valus are equal or not 

    if(str.equals(str2)){
        System.out.println("yes");
    }
    else {
        System.out.println("no");
    }
    
    System.out.println(str.substring(2,4)); //SUBSTRING

