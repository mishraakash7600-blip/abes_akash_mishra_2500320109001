 for (int i = 4; i >=1; i--) {
            for (int j = 1; j <=(4-i); j++) {
                System.out.print(" ");
            }
           
            for (int j = 1; j <=(i-n); j++) {
                System.out.print("*");

            }
            n++;
            System.out.println();
        } 