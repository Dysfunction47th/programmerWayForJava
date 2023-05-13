package programmerWayForJava.chapter02;

public class test2_7 {
    public static void main(String[] args) {
        int a = 5;
         
         
        // 첫번쟤 출력
        int d = a;
        int dStart = 1;
        

        int b = 1;
        int bStart = 1;
        int bCount = 1;

        int e = 1;
        int eCondition = e;
        int eStart = 1;
        int eCount = 1;
  
        // 두번쨰 출력 변수
  
        int bb = a * 2;
        int bbStart = 1;
        int bbCount = 1;

        int ee = 1;
        int eeStart = a + 4;
        int eeCondition = a + 4;
        int eeCount = 1;

        // 세번쨰 출력 변수
        
        int bbb = a * 2;
        int bbbStart = 1;
        int bbbCount = 1;

        int eee = 1;
        int eeeStart = 1;
        int eeeCondition = 1;
        int eeeCount = 1; 

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
                
                System.out.print("" + c + "");
                eStart += t;
                
            }
            
            e += 2;
            eCondition = e;
            eStart += 2;
            eStart = eCount;
           
            
////////////////////////////////////////////////////////////////  2번쨰 * 출력
         

            for (int k = bbStart; k <= bb - 2; k++) {
                
                System.out.print(" ") ;
                // System.out.print("0") ;

                // bbStart += k;
                
            }

            bb -= 2;
            bbStart = bbCount;
                        
            for (int t = eeStart; t <= eeCondition; t++) {
                
                System.out.print(c);
                eeStart += t;
                
            }

            ee += 2;
            eeCondition = ee;
            eeStart += 2;
            eeStart = eeCount;
            
////////////////////////////////////////////////////////////////  3번쨰 * 출력
         

            for (int k = bbbStart; k <= bbb - 2; k++) {
                            
                System.out.print(" ") ;
                // System.out.print("0") ;

                // bbStart += k;
                
            }

            bbb -= 2;
            bbbStart = bbbCount;
                        
            for (int t = eeeStart; t <= eeeCondition; t++) {
                
                System.out.print(c);
                eeeStart += t;
                
            }

            eee += 2;
            eeeCondition = eee;
            eeeStart += 2;
            eeeStart = eeeCount;

            System.out.println();
        }
    }
}
