package programmerWayForJava.chapter02;

public class test2_5 {
    public static void main(String[] args) {
        int a = 8;
        
        int d = a;
        int dStart = 1;
        // int dCondition = d;
        

        int b = 1;
        // int bCondition = b;
        int bStart = 1;
        int bCount = 1;

        int e = 1;
        int eCondition = e;
        int eStart = 1;
        int eCount = 1;

        int tCondition = 0;
        String c = "*";
        int j;

        for (int i = 0; i < a; i++) {
            
            for (j = dStart; j <= d; j++) {
                // System.out.print("0000") ;    
                System.out.print("  ") ;    
                
            }

            d -= 1; 

            for (int k = bStart; k <= b; k++) {
                
                // System.out.print("111") ;
                System.out.print(" ") ;

                bStart += k;
                
            }

            b += 1;
            // bCondition = b;
            bStart += 1;
            bStart = bCount;
            
            for (int t = eStart; t <= eCondition; t++) {
                
                System.out.print("" + c + "") ;
                eStart += t;
                
            }
            
            e += 2;
            eCondition = e;
            eStart += 2;
            eStart = eCount;
            tCondition += 2;
            
            System.out.println();


            
        }
        
///////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////   줄 감소

       
        int vStart = 1;
        int vCount = 1;

        
        for (int i = 0; i < a - 1; i++) {
            System.out.print("  ");
            for (j = dStart; j <= d; j++) {
                // System.out.print("0000") ;    
                
                System.out.print("   ") ;

                
            }

            d -= 1; 

            for (int k = vStart; k <= b; k++) {
                
                // System.out.print("111") ;
                System.out.print(" ") ;

                vStart += k;
                
            }

            b += 1;
            vStart += 1;
            vStart = vCount;

            tCondition -= 2;

            for (int w = 1; w < tCondition; w++) {
                System.out.print("" + c + "");
            }
            
            
            
            System.out.println();
        }

        
    }
}
