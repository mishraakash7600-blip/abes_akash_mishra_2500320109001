public class largest_array{
    public static void main(String[] args) {
        int number[]={1,2,34,5,67,87,54,45};
        int largest=Integer.MIN_VALUE;

        for (int i = 0; i < number.length; i++) {
            if(largest < number[i]){
                largest=number[i];
            }
        }
        System.out.println("LARGEST ELEMENT IN THE ARRAY: "+ largest);
    }
}