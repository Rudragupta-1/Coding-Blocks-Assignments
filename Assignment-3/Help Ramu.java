import java.util.*;

public class Main {
    public static void main(String args[]) {
        Scanner scanner = new Scanner(System.in);
        long testCases = scanner.nextLong();
        
        while (testCases-- > 0) {
            int cost1 = scanner.nextInt();
            int cost2 = scanner.nextInt();
            int cost3 = scanner.nextInt();
            int cost4 = scanner.nextInt();
            int numRikshaws = scanner.nextInt();
            int numCabs = scanner.nextInt();
            int[] rikshawFares = new int[numRikshaws];
            int[] cabFares = new int[numCabs];
            int totalRikshawCost = 0;
            int cabCost = 0;
            
            for (int i = 0; i < numRikshaws; i++) {
                int fare = scanner.nextInt();
                rikshawFares[i] = fare;
                totalRikshawCost += Math.min(fare * cost1, cost2);
            }
            totalRikshawCost = Math.min(totalRikshawCost, cost3);
            
            for (int i = 0; i < numCabs; i++) {
                int fare = scanner.nextInt();
                cabFares[i] = fare;
                cabCost += Math.min(fare * cost1, cost2);
            }
            cabCost = Math.min(cabCost, cost3);
            
            System.out.println(Math.min((cabCost + totalRikshawCost), cost4));
        }
    }
}
