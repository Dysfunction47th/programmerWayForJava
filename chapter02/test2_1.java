package programmerWayForJava.chapter02;

public class test2_1 {
    public static void main(String[] args) {
        int a = 7;
        int b = a;
        int j;
        String c = "*";

        for (int i = 0; i < a; i++) {

            for (j = a; j <= a; j++) {
                System.out.print(" ");
            }

            for (int k = 0; k < b; k++) {
                System.out.print(c);
            }

            for (j = a; j <= a; j++) {
                System.out.print("  ");
            }
            
            System.out.println();
        }
    }
}
