
import java.util.Scanner;

public class linear_search{
    public static int linear_search_usingRecursion(int[] marks,int key,int index,int size){
        if(index==size){
            return -1;
        }
        else if (marks[index]==key){
        return index;
        }
        return linear_search_usingRecursion(marks, key, index+1, size);
    }
    public static int linearsearchrec(int[] marks,int key,int index,int size ) {
        return linear_search_usingRecursion(marks, key, 0, marks.length);
        
    }
        public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int marks[]={1,2,3,4,5,6,7,8,9,10};
        int size=marks.length;
        int index = -1;
        System.out.print("ENTER THE REQUIRED ELEMENT: ");
         int key=sc.nextInt();


         int h=linearsearchrec(marks, key, index, size);
         System.out.println(h);
         
    //      for (int i = 0; i < marks.length; i++) {   
    //      if (marks[i]==key){
    //         index=i;
    //      } 
    // }

    // if (index!=-1){
    //     System.out.println("ELEMENT IS FOUND AT INDEX: "+index );
    // }else {
    //     System.out.println("ELEMENT IS NOT FOUND");
    // }
}
}