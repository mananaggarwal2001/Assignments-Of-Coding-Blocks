import java.util.Scanner;

public class Help_Ramu {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        int testCases = sc.nextInt();
        while (testCases > 0) {
            int c1 = sc.nextInt();
            int c2 = sc.nextInt();
            int c3 = sc.nextInt();
            int c4 = sc.nextInt();
            int rickShawNumber = sc.nextInt();
            int cabNumber = sc.nextInt();
            int[] rickShawArray = new int[rickShawNumber];
            int[] cabArray = new int[cabNumber];
            for (int i = 0; i < rickShawArray.length; i++) {
                rickShawArray[i] = sc.nextInt();
            }
            for (int i = 0; i < cabArray.length; i++) {
                cabArray[i] = sc.nextInt();
            }
            int costRickShawCabRide = 0;
            for (int i = 0; i < rickShawArray.length; i++) {
                costRickShawCabRide += Math.min(rickShawArray[i] * c1, c2);
            }
            int finalRickShawRide = Math.min(costRickShawCabRide, c3);
            // for the cab service we will do the same.
            int costCabRideService = 0;
            for (int i = 0; i < cabArray.length; i++) {
                costCabRideService += Math.min(cabArray[i] * c1, c2);
            }
            int finalCostCabRideService = Math.min(costCabRideService, c3);
            int finalresult = Math.min(finalCostCabRideService + finalRickShawRide, c4);
            System.out.println(finalresult);
            testCases--;
        }
    }
}
