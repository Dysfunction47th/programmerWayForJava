package programmerWayForJava.chapter01;

public class test2 {
    public static void main(String[] args) {
        
        int a = 5;
        int b = a;
        int withdrawNumber = a * a;


        for (int i = 0; i < a; i++) {
            
            withdrawNumber = withdrawNumber - a + 1;
            
            for (int j = 0; j < b; j++) {
            
                // System.out.println("wdnumber = " + withdrawNumber);
                System.out.print(withdrawNumber + " ");
                withdrawNumber += 1;
            }
            System.out.println();

            withdrawNumber -= a + 1;
        
        }
         
        
    
    }

    
}
// 5  25 -> 21 4
// 4  16 -> 1234 5678 9101112  13141516 3
// 3   9 -> 7  2
// 2   4 -> 3  1 