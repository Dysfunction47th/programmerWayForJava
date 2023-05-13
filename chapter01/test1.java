package programmerWayForJava.chapter01;

public class test1 {
    public static void main(String[] args) {
        int aConditonNumber = 3;
        int aInitialNumber = 1;
        int a = 0;
        int j;

        for (int i = 1; i <= 5; i++) {
            
            a += aConditonNumber;

            for (j = aInitialNumber; j <= a; j++) {
                    System.out.print(j + " ");
            }

            
            aInitialNumber = j;

            System.out.println();
        }

    }
    
}
