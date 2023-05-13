package programmerWayForJava.chapter01;

public class test10 {
    

    public static void main(String[] args) {

        int a = 5;
        
        int d = a;
        int dStart = 1;
        

        int b = 1;
        int bStart = 1;
        int bCount = 1;


        int startNumber = 1;
        int jConditionPlusNumber = 2;
        int jConditionNumber = 1;
        
        int j;

        for (int i = 0; i < a; i++) {
            
            for (j = dStart; j <= d; j++) { // 칸 조정 공백 출력  
                System.out.print("    ") ;    
                
            }

            d -= 1; 

            for (int k = bStart; k <= b; k++) { // 칸 유자 공백 조정
                
                System.out.print("   ") ;
                bStart += k;
                
            }

  

            b += 1;
            bStart = 1;
            bStart = bCount;
            

            
            for (int w = startNumber; w <= jConditionNumber; w++) {
                System.out.print( w);
                startNumber = w;
            }

            
            jConditionNumber += jConditionPlusNumber;
            startNumber += 1;
            jConditionPlusNumber += 1;
            System.out.println();
            

            
            System.out.println();
        }
    }
}





  

//             1
//          2  3
//       4  5  6
//    7  8  9 10 
//11 12 13 14 15 
