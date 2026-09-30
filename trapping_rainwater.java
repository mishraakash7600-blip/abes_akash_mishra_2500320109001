class trapping_rainwater{
    public static int trapping(int height[]){
        int width=1;
        int total_trapped=0;
        // leftmax boundary array
        int leftmax[]=new int[height.length];
        leftmax[0]=height[0];
        for (int i = 1; i < height.length; i++) {
            leftmax[i]=Math.max(leftmax[i-1],height[i]);
        }
        // rightmax boundary array
        int rightmax[]=new int[height.length];
        rightmax[rightmax.length-1]=height[height.length-1];
        for (int i = rightmax.length-2; i >= 0; i--) {
            rightmax[i]=Math.max(height[i],rightmax[i+1]);
        }

        // loop
        for (int i = 0; i < height.length; i++) {
            // waterlevel=min(leftmax bound,rightmaxbound)
            int waterlevel=Math.min(leftmax[i],rightmax[i]);

            // trapped water=(waterlevel-height)*width
            int trapped_water=(waterlevel-height[i])*width;

            total_trapped+=trapped_water;


        }
        return total_trapped;
    }
    public static void main(String[] args) {
        int height[]={4,2,0,6,3,2,5};
        System.out.println("total trapped water= "+ trapping(height));
    }
}