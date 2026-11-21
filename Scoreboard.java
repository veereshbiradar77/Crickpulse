import java.util.Scanner;

public class Scoreboard {
    public static void main(String[] args) {
        Scanner scorer = new Scanner(System.in);

        String teamName = "Bengaluru Strikers";
        int runs = 0;
        int wickets = 0;
        int balls = 0;

        
        System.out.println("=== CricPulse Live Scorer ===");
        System.out.println("Select Format: 1 = T20 (20 overs), 2 = ODI (50 overs), 3 = Test (Unlimited)");
        System.out.print("Enter choice (1, 2, or 3): ");
        int formatChoice = scorer.nextInt();

        int maxOvers = 0;
        String formatName = "";

        if (formatChoice == 1) {
            maxOvers = 20;
            formatName = "T20";
        } else if (formatChoice == 2) {
            maxOvers = 50;
            formatName = "ODI";
        } else {
            maxOvers = -1; 
            formatName = "Test";
        }

        System.out.println("\nMatch Started (" + formatName + ")!");
        System.out.println("Type runs (0, 1, 2, 3, 4, 6), W for wicket, or Q to quit.");

        while (true) {
            System.out.print("\nBall result: ");
            String result = scorer.next();

            if (result.equalsIgnoreCase("Q")) {
                System.out.println("Innings ended by scorer!");
                break;
            } else if (result.equalsIgnoreCase("W")) {
                wickets = wickets + 1;
                balls = balls + 1;
            } else {
                int scoredRuns = Integer.parseInt(result);
                runs = runs + scoredRuns;
                balls = balls + 1;
            }

            
            int completedOvers = balls / 6;
            int remainingBalls = balls % 6;

        
            if (maxOvers == -1) {
                System.out.println(teamName + ": " + runs + "/" + wickets + " (" + completedOvers + "." + remainingBalls + " overs - Test)");
            } else {
                System.out.println(teamName + ": " + runs + "/" + wickets + " (" + completedOvers + "." + remainingBalls + " / " + maxOvers + " overs)");
            }

            if (remainingBalls == 0 && balls > 0) {
                System.out.println("--- OVER COMPLETE! ---");
            }

            if (wickets == 10) {
                System.out.println("ALL OUT! Innings complete.");
                break;
            }
            if (maxOvers != -1 && completedOvers == maxOvers) {
                System.out.println(maxOvers + " OVERS COMPLETE! Innings finished.");
                break;
            }
        }

        scorer.close();
    }
}