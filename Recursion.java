public class Recursion{
    public static void printdec(int n){
        if(n==n){
            System.out.print(n);
            return;
        }
        System.out.print(n+" ");
        printdec(n-1);
    }

    public static void printinc(int n) {
    if(n == 1) {
        System.out.print(n + " ");
        return;
    }

    printinc(n - 1);
    System.out.print(n + " ");
    }

    public static int printfacto(int n){
        if(n==0){
            return 1;
        }
        int fnm1=printfacto(n-1);
        int fn=n*fnm1;
        return fn;
    }

    public static int natural_n(int n){
        if(n==1){
            return 1;
        }
        int sn_1=natural_n(n-1);
        int sum=n+sn_1;
        return sum;
    }

    public static int fib(int n){
        if(n==0 || n==1){
            return n;
        }
        int fibn_1=fib(n-1);
        int fibn_2=fib(n-2);
        int fibn=fibn_1 + fibn_2;
        return fibn;
    }

    public static boolean isSorted(int arr[],int i){
        if(i==arr.length-1){
            return true;
        }
        if(arr[i]>arr[i+1]){
            return false;
        }
       return isSorted(arr, i+1);
    }

    public static int firstOccurence(int[] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        if(arr[i]==key){
            return i;
        }
        int fo=firstOccurence(arr, key, i+1);
        return fo;
    }
    public static int lastOccurence(int[] arr,int key,int i){
        if(i==arr.length){
            return -1;
        }
        int isfound=lastOccurence(arr, key, i+1);
        if(isfound ==-1 && arr[i]==key){
            return i;
        }
        return isfound;
    }

    public static int power(int x,int n) {
        if(n==0){
            return 1;
        }
        return x*power(x, n-1);
        
    }
    public static void main(String[] args) {
      
        int arr[]={1,2,3,4,5,6,7,8,9};
        firstOccurence(arr, 5, 0);
        
        
    }
}