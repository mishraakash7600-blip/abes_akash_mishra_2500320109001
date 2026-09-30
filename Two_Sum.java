public class Two_Sum{
    public static int[] twoSum(int nums[],int target){
        for (int i = 0; i < nums.length; i++) {
            for (int j = i+1; j < nums.length; j++) {
                if (nums[i]+nums[j]==target){
                 return new int[] {i,j};
            }
         }
      }
      return new int[] {};
    }
        public static void main(String[] args) {
            int nums[]={11,15,2,7};
            int target=9;
            twoSum(nums , target);
        }
}