/*
 * 
 * 
 */


import java.util.Random;
import java.time.LocalDateTime;
import java.time.format.DateTimeFormatter;

public class rollDiceSimulate {
    public static void main(String[] args) {
        LocalDateTime now = LocalDateTime.now();
        DateTimeFormatter formatter = DateTimeFormatter.ofPattern("EEEE, MM-dd-yyyy , (HH:mm:ss a)");
        String Date_and_time = now.format(formatter);

        Random random = new Random();
        int[] totals = new int[13];
        
        for (int roll = 0; roll < 36_000_000; roll++) {
            int face1 = random.nextInt(6) + 1; // 1-6
            int face2 = random.nextInt(6) + 1; // 1-6
            totals[face1 + face2]++;
        }
        System.out.printf("%3s%12s%12s%n", "Sum", "Frequency", "Percentage");
        for (int k = 2; k < totals.length; k++) {
            int freq = totals[k];
            int percent = freq / 360_000; 
            
            System.out.printf("%3d%12d%12d%n", k, freq, percent);
        }
    System.out.println("\nThank you for using my Program 5 application.");
    System.out.print("Time of Calculation is: " + Date_and_time);
    
    System.exit(0);
    }
}