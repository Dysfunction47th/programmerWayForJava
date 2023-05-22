package programmerWayForJava.chapter02;

public class test2_8 {
    public static void main(String[] args) {
        int a = 5;
        String c = "*";
        // 첫번쟤 출력
        int d = a;
        int dStart = 1;
        

        int e = 1;
        int eCondition = e;
        int eStart = 1;
        int eCount = 1;
        int j ;


        // 두번쨰 출력 변수
      
  
        int bb = a * 2;
        int bbStart = 1;
        int bbCount = 1;    
        int ee = 1;
        int eeStart = 1;
        int eeCondition = a + 4;
        int eeCount = 1;
        

        for (int i = 0; i < a; i++) {
            
            for (j = dStart; j <= d; j++) {
                // System.out.print("0000") ;    
                System.out.print(" ") ;    
                
            }

            d -= 1; 


            for (int t = eStart; t <= eCondition; t++) {
                
                System.out.print("" + c + "");
    
            }
            
            e += 2;
            eCondition = e;
            ///////////////////// 2번째 출력
            ///////////////////////////////////////////////////////////////
            for (int k = bbStart; k <= bb - 2; k++) {
                    
                System.out.print(" ") ;
                // System.out.print("0");
            }

            bb -= 2;
            bbStart = bbCount;
                        
            for (int t = eeStart; t <= eeCondition; t++) {
                
                System.out.print(c);
                
            }

            ee += 1;
            eeCondition += ee;
            
            eeStart = eeCount;
            ee = 1;
            System.out.println();  
        
        }    



   
    }
}
