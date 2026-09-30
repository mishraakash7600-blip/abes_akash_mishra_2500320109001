
import java.util.Scanner;
public class min_length{
    public static int min_subarraylength(int target,int[] nums) {
        int left=0;
        int sum=0;
        int min_length=Integer.MAX_VALUE;

        for (int right = 0; right < nums.length; right++) {
            sum+=nums[right];

            while(sum>=target){
                min_length=Math.min(min_length, right-left+1);
                sum-=nums[left];
                left++;
            }
        }

        return min_length==Integer.MAX_VALUE?0 :min_length;
    }

    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
        int nums[]={2,3,1,2,3,4,2};
        System.out.println("ENTER THE TARGET= ");
        int target=sc.nextInt();

        min_subarraylength(target, nums);
        
    }
}