package programmerWayForJava.chapter02;

public class test2_4 {
    public static void main(String[] args) {
        int a = 5;
        
        int d = a;
        int dStart = 1;
        

        int b = 1;
        int bStart = 1;
        int bCount = 1;

        int e = 1;
        int eStart = 1;
        int eCount = 1;

        String c = "*";
        int j;

        for (int i = 0; i < a; i++) {
            
            for (j = dStart; j <= d; j++) {
                // System.out.print("0000") ;    
                System.out.print("    ") ;    
                
            }

            d -= 1; 

            for (int k = bStart; k <= b; k++) {
                
                // System.out.print("111") ;
                System.out.print("   ") ;

                bStart += k;
                
            }
            b += 1;
            bStart += 1;
            bStart = bCount;
            
            for (int t = eStart; t <= e; t++) {
                
                System.out.print("" + c + "") ;
                eStart += t;
                
            }

            
            

            e += 2;
            eStart += 2;
            eStart = eCount;
            System.out.println();
        }
    }
}
