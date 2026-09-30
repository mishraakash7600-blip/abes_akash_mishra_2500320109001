public class swap_num{
public static void swap(int a,int b) { //WITH USING FUNCTION
        a=a+b;
        b=a-b;
        a=a-b;
        System.out.println("A="+a );
        System.out.println("B="+b);

}
    public static void main(String[] args) {
        //WITHOUT USING FUNCTION 
        int A=1;
        int B=2;
        swap(A,B);

        // a=a+b;
        // b=a-b;
        // a=a-b;
        // System.out.println("a="+a );
        // System.out.println("b="+b);

    }

}