import java.util.Scanner;
public class linear_search2{
    public static void main(String[] args) {
        Scanner sc=new Scanner(System.in);
       
        String menu[]={"chole bhature","dosa","halwa","kachori"};
        String key=sc.nextLine();
        int index=-1;
        for (int i = 0; i < menu.length; i++) {
         if(menu[i].equals(key)){
            index=i;
            break;
         }
        }

        if(index==-1){
            System.out.println("ELEMENT IS NOT FOUND");
        }else{
            System.out.println("ELEMENT IS AT INDEX: "+index);

        }

    }
}