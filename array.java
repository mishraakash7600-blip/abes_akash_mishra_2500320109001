
import java.util.Scanner;


public class array{
    public static void update(int marks[]) {
        for (int i = 0; i <marks.length; i++){
            marks[i]=marks[i]+1;
            System.out.print(marks[i]+" ");      
        }
    }
    public static void main(String[] args) {
        // CREATION OF AN ARRAY
        int f_array[]=new int[50];

        // int number[]={1,3,2};

        // String fruits[]={"apple","banana","grapes"};

        // INPUT FROM USER 
        Scanner sc=new Scanner(System.in);
        System.out.println("ENTER THE ELEMENTS: ");
        f_array[0]=sc.nextInt();
        f_array[1]=sc.nextInt();

        // OUTPUT FROM ARRAY
        System.out.println("ELEMENT STORED: "+  f_array[0]);
        System.out.println("ELEMENT STORED: "+  f_array[1]);
        System.out.println("ELEMENT STORED: "+  f_array[10]);

        //  UPDATION IN ARRAY
        f_array[0]=f_array[0]+1;
        System.out.println("ELEMENT STORED: "+  f_array[0]);


        System.out.println("AVERAGE WILL BE: "+(f_array[0]+f_array[1])/2);

        // UPDATION BY FUNCTION(CALL BY REFERNCE)
        int marks[]={1,2,3,4};
        update(marks);




    }
}