public class prime_no_function{
    public static boolean isprime(int n) {
        boolean isprime=true;
        for (int i = 2; i < n;i++) {
           if(n%i==0){
            isprime=false;
           }
        }
        return isprime;
    }
    public static void main(String[] args) {
        System.out.println(isprime(5));
        System.out.println(isprime(2));
    }
}