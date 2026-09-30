public class kadane_optimised{
    public static void kadane(int number[]) {
        int sum=0;
        int maxsum=Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            sum+=number[i];

            maxsum=Math.max(sum,maxsum);

            if(sum < 0){
                sum=0;
            }

            
        }

        System.out.println("MAXIMUM SUBARRAY SUM WILL BE: "+maxsum);
    }
    public static void main(String[] args) {
        int number[]={-2,-3,-4,-1,-2,-1,-5,-3};
        kadane(number);

    }
}