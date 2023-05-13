package programmerWayForJava.chapter02;

public class test2_2 {
    public static void main(String[] args) {
        int a = 5;
        int b = 1;
        int bStart = 1;
        int bCount = 1;

        String c = "*";
        int j;

        for (int i = 0; i < a; i++) {
            
            for (j = a; j <= a; j++) {
                System.out.print("  ");    
            }

            for (int k = bStart; k <= b; k++) {
                System.out.print(c);
                bStart += k;
                
            }

            

            for (j = a; j <= a; j++) {
                System.out.print("  ");        
            }

            b += 1;
            bStart += 1;
            bStart = bCount;
            System.out.println();
        }


    }
}
