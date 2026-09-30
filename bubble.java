class bubble{
    public static void bubblesort(int arr[]){
      for (int i = 0; i < arr.length-1; i++) {
          for (int j = i+1; j < arr.length-1-i; j++) {
              if(arr[j]> arr[j+1]){
                int temp=arr[j];
                arr[j]=arr[j+1];
                arr[j+1]=temp;
              }
          }
      }
    }
    public static void main(String[] args) {
        int arr[]={1,2,5,4,6,4,54,5,115,58};
        bubblesort(arr);

        for (int i = 0; i < arr.length; i++) {
            System.err.print(arr[i]+" ");
        }
        int j=0;
        int[] top=new int[5];
        for (int i = arr.length-1; i >arr.length-5; i--) {
            top[j]=arr[i];
            j++;
        }
        System.out.print("top 5= ");
        for (int i = 0; i < top.length; i++) {
            System.out.print(top[i]+" ");
        }

        int[] least=new int[5];
        int sum=0;
        for (int i = 0; i < 5; i++) {
            sum+=arr[i];
        }
         System.out.print("sum= "+sum);
        //  for (int i = 0; i < top.length; i++) {
        //     System.out.print(least[i]+" ");
        // }

    }
}