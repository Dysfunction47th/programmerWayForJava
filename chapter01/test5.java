package programmerWayForJava.chapter01;

public class test5 {
    public static void main(String[] args) {
        int a = 5;
        int jConditonNumber = 1;
        int startNumber = 1;
        int jConditonPlusNumber = 2;
        

        for (int i = 0; i <= a; i++) {
            
            for (int j = startNumber; j <= jConditonNumber; j++) {
                System.out.print(j + " ");
                startNumber = j;
            }

            jConditonNumber += jConditonPlusNumber;
            startNumber += 1;
            jConditonPlusNumber += 1;
            System.out.println();
        }

    }
}
