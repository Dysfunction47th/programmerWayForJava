package programmerWayForJava.chapter02;

public class test2_6 {
    public static void main(String[] args) {
        int a = 11;
        // 11   bb = 18
        // 10   bb = 18
        // 9    bb = 14
        // 8    bb = 14
        // 7    bb = 12
        // 6    bb = 12
        // 5    bb = 8
        // 4    bb = 8
        // 3    bb = 4
        // 2    bb = 4
        // 1    bb = 2
         
         
        // 첫번쟤 출력
        int d = a;
        int dStart = 1;
        // int dCondition = d;
        

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
        int eeStart = 1;
        int eeCondition = 1;
        int eeCount = 1;

        int ttCondition = 0;
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
            
            bStart += 1;
            bStart = bCount;
            
            for (int t = eStart; t <= eCondition; t++) {
                
                System.out.print("" + c + "");
                
                
            }
            
            e += 2;
            eCondition = e;
            
            eStart = eCount;
            tCondition += 2;
            
////////////////////////////////////////////////////////////////  2번쨰 * 출력
         

            for (int k = bbStart; k <= bb - 2; k++) {
                
                System.out.print(" ") ;
                // System.out.print("0") ;

                // bbStart += k;
                
            }

            bb -= 2;
            bbStart = bbCount;
                        
            for (int t = eeStart; t <= eeCondition; t++) {
                
                System.out.print(c );
                
            }

            ee += 2;
            eeCondition = ee;
            eeStart = eeCount;
            ttCondition += 2;
            
            

            System.out.println();


            
        }
        
///////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////

///////////////////////////////////////////////////////////////////////////////////

////////////////////////////////////////   줄 감소

       
        int vStart = 1;
        int vCount = 1;

        int vvStart = 1;
        int vvCount = 1;
        int bbv = 2;
        
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
            vStart = vCount;

            tCondition -= 2;

            for (int w = 1; w < tCondition; w++) {
                System.out.print("" + c + "");
            }
            
////////////////////////////////////////////////////////////// 2번쨰 줄감소
            
            

            for (int k = vvStart; k <= bbv; k++) {
                
                System.out.print(" ") ;
                // System.out.print("0") ;

                // vvStart += k;
                
            }

            bbv += 2;
            vvStart = vvCount;

            ttCondition -= 2;

            for (int w = 1; w < ttCondition; w++) {
                System.out.print(c);
            }


            System.out.println();
        }

    }
}
