public class selection{
    public static void selectionsort(int arr[]){
        for (int i = 0; i < arr.length-1; i++) {
            int min_element=i;
            for (int j = i+1; j < arr.length; j++) {
                if(arr[min_element]>arr[j]){
                    min_element=j;
                }
            }
                    int temp = arr[i];
                    arr[i]=arr[min_element];
                    arr[min_element]=temp;
                }
            }
        }
   