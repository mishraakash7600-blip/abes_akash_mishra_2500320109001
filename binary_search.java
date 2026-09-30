import java.util.*;                                   
public class binary_search{
    public static int binarysearch(int numbers[],int key){
        int start=0;
        int end=numbers.length-1;

        while (start<=end) { 
            int mid= (start+end)/2;
            // COMPARISON
            if(numbers[mid]==key){    //mid is equal to key
                return mid;
            }
            else if(numbers[mid] < key){   //right
                 start=mid+1;
            }
             else{  //left
                end=mid-1;
             }
            }
        return -1;
 }
 public static void main(String[] args) {
     Scanner sc=new Scanner(System.in);
        int numbers[]={1,2,3,4,5,6,10,12,14,16};
        System.out.print("ENTER THE REQUIRED ELEMENTS: ");
        int key=sc.nextInt();
        System.out.println("ELEMENTS FOUND AT INDEX: "+ binarysearch(numbers, key));
 }
}