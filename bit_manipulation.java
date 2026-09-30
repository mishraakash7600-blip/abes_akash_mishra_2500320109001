public class bit_manipulation{
    public static void oddoreven(int n){
        int bitmask = 1;
        if((n & bitmask) == 0){
            System.out.println("Even");
        }else{
            System.out.println("Odd");
        }
    }

    public static boolean ispowerof2(int n){
        return (n & (n-1)) == 0;
    }

    public static int countSetBits(int n){
        int count = 0;
        while(n > 0){
            if((n & 1) == 1){
                count++;
            }
            n = n>>1;
        }
        return count;
    }

    public static int fastExpo(int a, int n){
        int ans = 1;
        while(n > 0){
            if((n & 1) == 1){
                ans = ans * a;
            }
            a = a * a;
            n = n>>1;
        }
        return ans;
    }

    public static int GetIthBit(int n, int i){
        int bitmask = 1<<i;
        if((n & bitmask) == 0){
            return 0;
        }else{
            return 1;
        }
    }

    public static int SetIthBit(int n, int i){
        int bitmask = 1<<i;
        return n | bitmask;
    }

    public static int ClearIthBit(int n, int i){
        int bitmask = ~(1<<i);
        return n & bitmask;
    }

    public static int UpdateIthBit(int n, int i, int newBit){
        if(newBit == 0){
            return ClearIthBit(n, i);
        }else{
            return SetIthBit(n, i);
    }
    }

    public static int ClearLastIBits(int n, int i){
        int bitmask = (~0)<<i;
        return n & bitmask;
    }

    public static int ClearRangeOfBits(int n, int i, int j){
        int a = (~0)<<(j+1);
        int b = (1<<i)-1;
        int bitmask = a | b;
        return n & bitmask;
    }

    public static void main(String args[]){ 
        oddoreven(3);
        oddoreven(11);
        System.out.println(GetIthBit(5, 2));
        System.out.println(SetIthBit(5, 1));
        System.out.println(ClearIthBit(5, 2));
        System.out.println(UpdateIthBit(5, 2, 1));
        System.out.println(ClearLastIBits(15, 2)); 
        System.out.println(ClearRangeOfBits(15, 1, 2));
        System.out.println(ispowerof2(8));
        System.out.println(countSetBits(15));
        System.out.println(fastExpo(2, 3)); 
        }
} 
