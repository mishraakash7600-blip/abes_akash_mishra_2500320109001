import java.util.Scanner;
public class shortest_path{
    public static float  shortestpath(String path) {
        int x=0,y=0;
        int n=path.length();
        for (int i = 0; i <n ; i++) {
            char dir=path.charAt(i);

            // south
            if(dir=='s'){
                y--;
            }
            else if(dir=='n'){      //north
                y++;
            }
            else if(dir=='w'){    //west
                x--;
            }
            else{x++;}   //east
        }

        int X2=x*x;
        int Y2=y*y;
      return (float) Math.sqrt(X2 + Y2);
    }
    public static void main(String[] args) {
        Scanner sc= new Scanner(System.in);
        String path="WNEENESENNN";
       System.out.println( shortestpath(path));
        
    }
}