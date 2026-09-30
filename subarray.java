public class subarray{
    public static void sub_array(int number[]) {
        int maxsum=Integer.MIN_VALUE;
        for (int i = 0; i < number.length; i++) {
            int start=i;
            for (int j = i; j < number.length; j++) {
                int end=j;
                int sum=0;

                for (int k = start; k <=end; k++) {
                    System.out.print(number[k]+" "); //subarray 
                    sum+=number[k];  //sum of subarray

                }
             System.out.println("="+sum);

             if(sum>maxsum){
                maxsum=sum;
             }
            }
            System.out.println();
        }
        System.out.println("MAXIMUM SUBARRAY SUM= "+maxsum);
    }
    public static void main(String[] args) {
        int number[]={1,2,3,4};
        sub_array(number);
    }
}