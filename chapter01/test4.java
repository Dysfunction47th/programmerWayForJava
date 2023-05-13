package programmerWayForJava.chapter01;

public class test4 {
    public static void main(String[] args) {
        int a = 5;
        int jConditonNumber = 1;
        for (int i = 0; i <= a; i++) {
            
            for (int j = 1; j < jConditonNumber; j++) {
                System.out.print(j + " ");
            }
            jConditonNumber += 1;
            
            System.out.println();
        }
    }
}
