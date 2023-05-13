package programmerWayForJava.chapter01;

public class test6 {
    public static void main(String[] args) {
        int a = 5;
        int b = a;

        for (int i = 0; i <= a; i++) {
            
            for (int j = 1; j <= b; j++) {
                System.out.print(j + " ");
            }
            System.out.println();

            b -= 1;
        }
    }
    
}
