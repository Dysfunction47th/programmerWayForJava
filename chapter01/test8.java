package programmerWayForJava.chapter01;

public class test8 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        int withdrawNumber = a ;


        for (int i = 0; i < a; i++) {
            
            withdrawNumber = withdrawNumber - a + 1;
            
            for (int j = 0; j < b; j++) {
            
                // System.out.println("wd isNumber = " + withdrawNumber);
                System.out.print(withdrawNumber + " ");
                withdrawNumber += 1;
            }
            System.out.println();

            // withdrawNumber -= a;
        }
  
    }
}
