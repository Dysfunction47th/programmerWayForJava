package programmerWayForJava.chapter01;

public class test9 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;
        int c = 1;
        int jPlusN = 1;

        for (int i = 1; i <= a; i++) {
            
            b += 1;
            
            for (int j = jPlusN; j < b; j++) {
                System.out.print(j + " ");
                // System.out.print("j = " + j + " ");
            }
            

            for (int k = 1; k < c ; k++) {
                System.out.print(k + " ");
                
            }

            System.out.println();

            b -= 1;
            c += 1;

            jPlusN += 1;
            // System.out.println("jplus = " + jPlusN);
            
        }
    }
}
