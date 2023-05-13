package programmerWayForJava.chapter01;

public class test7 {
    public static void main(String[] args) {
        
        int a = 5;
        int b = a;
        int jStartNumber = 1;
        for (int i = 0; i <= a; i++) {
            
            for (int j = 1; j <= b; j++) {
                // System.out.printf(   jStartNumber + " ");
                System.out.printf("%2d ", jStartNumber);  // 전체 10자리 (우측정렬)
                jStartNumber += 1; 
            }
            System.out.println();

            b -= 1;
        }

    }
}
