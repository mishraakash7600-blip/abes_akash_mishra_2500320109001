public class prefixarray{
    public static void maxsubarrayprefix(int arr[]){
        int prefix[]=new int[arr.length];   // PREFIX ARRAY CREATION
        int maxsum=Integer.MIN_VALUE;
        int sum=0;

        
        prefix[0]=arr[0];                            //element at 0 index
         for (int i = 1; i < arr.length; i++) {
            prefix[i]=prefix[i-1]+arr[i];
         }

         for (int i = 0; i < prefix.length; i++) {
            
             for (int j = i; j < prefix.length; j++){
                 if(i==0){
                    sum=prefix[j];
                 }
                 else{
                    sum=prefix[j]-prefix[i-1];
                 }
             }
         }
        if(sum>maxsum){
            maxsum=sum;
        }

        System.out.println("MAXIMUM SUBARRAY SUM WILL BE= "+maxsum);

             
    }

    public static void main(String[] args) {
        int arr[]={2,4,6,8};
        maxsubarrayprefix(arr);
    }
}
// DRY RUN


// # MAX SUBARRAY SUM USING PREFIX ARRAY (DRY RUN)

// ## 🔹 Given Array

// arr = [2, -3, 4, -1, 2]

// ---

// ## 🔹 Step 1: Create Prefix Array

// Prefix array stores cumulative sum:

// prefix[0] = arr[0]
// prefix[i] = prefix[i-1] + arr[i]

// ### Calculation:

// prefix[0] = 2
// prefix[1] = 2 + (-3) = -1
// prefix[2] = -1 + 4 = 3
// prefix[3] = 3 + (-1) = 2
// prefix[4] = 2 + 2 = 4

// ### Final Prefix Array:

// prefix = [2, -1, 3, 2, 4]

// ---

// ## 🔹 Step 2: Formula Used

// If i == 0
// sum = prefix[j]

// Else
// sum = prefix[j] - prefix[i-1]

// ---

// ## 🔹 Step 3: Initialize

// maxSum = -∞ (Integer.MIN_VALUE)

// ---

// ## 🔹 Step 4: Dry Run (All Subarrays)

// ### i = 0

// j = 0 → sum = prefix[0] = 2
// maxSum = 2

// j = 1 → sum = prefix[1] = -1
// maxSum = 2

// j = 2 → sum = prefix[2] = 3
// maxSum = 3

// j = 3 → sum = prefix[3] = 2
// maxSum = 3

// j = 4 → sum = prefix[4] = 4
// maxSum = 4

// ---

// ### i = 1

// j = 1 → sum = prefix[1] - prefix[0] = -1 - 2 = -3
// maxSum = 4

// j = 2 → sum = prefix[2] - prefix[0] = 3 - 2 = 1
// maxSum = 4

// j = 3 → sum = prefix[3] - prefix[0] = 2 - 2 = 0
// maxSum = 4

// j = 4 → sum = prefix[4] - prefix[0] = 4 - 2 = 2
// maxSum = 4

// ---

// ### i = 2

// j = 2 → sum = prefix[2] - prefix[1] = 3 - (-1) = 4
// maxSum = 4

// j = 3 → sum = prefix[3] - prefix[1] = 2 - (-1) = 3
// maxSum = 4

// j = 4 → sum = prefix[4] - prefix[1] = 4 - (-1) = 5
// maxSum = 5

// ---

// ### i = 3

// j = 3 → sum = prefix[3] - prefix[2] = 2 - 3 = -1
// maxSum = 5

// j = 4 → sum = prefix[4] - prefix[2] = 4 - 3 = 1
// maxSum = 5

// ---

// ### i = 4

// j = 4 → sum = prefix[4] - prefix[3] = 4 - 2 = 2
// maxSum = 5

// ---

// ## 🔹 Final Answer

// Maximum Subarray Sum = 5

// Subarray = [4, -1, 2]

// ---

// ## 🔹 Key Concept

// Instead of calculating sum using loop:

// 4 + (-1) + 2 = 5

// We use prefix:

// prefix[4] - prefix[1] = 4 - (-1) = 5

// ---

// ## 🔹 Conclusion

// * Prefix array helps avoid extra loop
// * Time Complexity reduces from O(n³) to O(n²)
// * Subarray sum can be calculated in O(1)

// ---

// ## 🔹 Important Point to Remember

// prefix[j] → sum from index 0 to j
// prefix[i-1] → sum before starting index

// So subtracting gives required subarray sum

// ---

// END
