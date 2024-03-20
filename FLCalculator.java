import java.util.Scanner;
import java.lang.Math;

public class FanLaws {
    static Scanner scanner = new Scanner(System.in);

    public static double calculate1aCFM() {
        System.out.println("Enter the current CFM:");
        double oldCFM = scanner.nextDouble();
        System.out.println("Enter the current RPM:");
        double oldRPM = scanner.nextDouble();
        System.out.println("Enter the new RPM:");
        double newRPM = scanner.nextDouble();
        return oldCFM * (newRPM / oldRPM);
    }

    public static double calculate1aRPM() {
        System.out.println("Enter the current RPM:");
        double oldRPM = scanner.nextDouble();
        System.out.println("Enter the current air flow in CFM:");
        double oldCFM = scanner.nextDouble();
        System.out.println("Enter the new air flow in CFM:");
        double newCFM = scanner.nextDouble();
        return oldRPM * (newCFM / oldCFM);
    }
    
    public static double calculate1aMPD() {
        System.out.println("Enter the current MPD:");
        double oldMPD = scanner.nextDouble();
        System.out.println("Enter the current RPM");
        double oldRPM = scanner.nextDouble();
        System.out.println("Enter the new RPM:");
        double newRPM = scanner.nextDouble();
        return oldMPD * (newRPM / oldRPM);
    }
    
    public static double calculate1aFPD() {
        System.out.println("Enter the current FPD:");
        double oldFPD = scanner.nextDouble();
        System.out.println("Enter the current RPM");
        double oldRPM = scanner.nextDouble();
        System.out.println("Enter the new RPM:");
        double newRPM = scanner.nextDouble();
        return oldFPD * (oldRPM / newRPM);
    }
    
    public static double calculate1bRPM() {
        System.out.println("Enter the current RPM:");
        double oldRPM = scanner.nextDouble();
        System.out.println("Enter the current SP");
        double oldSP = scanner.nextDouble();
        System.out.println("Enter the new SP:");
        double newSP = scanner.nextDouble();
        return oldRPM * Math.sqrt((newSP / oldSP));
    }
    
    public static double calculate1bSP() {
        System.out.println("Enter the current SP:");
        double oldSP = scanner.nextDouble();
        System.out.println("Enter the current RPM");
        double oldRPM = scanner.nextDouble();
        System.out.println("Enter the new RPM:");
        double newRPM = scanner.nextDouble();
        return oldSP * Math.pow((newRPM / oldRPM), 2);
    }
    
    public static double calculate1cBHP() {
        System.out.println("Enter the current BHP:");
        double oldBHP = scanner.nextDouble();
        System.out.println("Enter the current RPM");
        double oldRPM = scanner.nextDouble();
        System.out.println("Enter the new RPM:");
        double newRPM = scanner.nextDouble();
        return oldBHP * Math.pow((newRPM / oldRPM), 3);
    }

    public static double calculate1cRPM() {
        System.out.println("Enter the current RPM:");
        double oldRPM = scanner.nextDouble();
        System.out.println("Enter the current BHP");
        double oldBHP = scanner.nextDouble();
        System.out.println("Enter the new BHP:");
        double newBHP = scanner.nextDouble();
        return oldRPM * Math.cbrt(newBHP / oldBHP);
    }
    
    public static void main(String[] args) {
        System.out.println("Which fan law do you want to calculate?\n1. 1aCFM\n2. 1aRPM\n3. 1aMPD\n4. 1aFPD\n5. 1bRPM\n6. 1bSP\n7. 1cBHP\n8. 1cRMP\n");
        int choice = scanner.nextInt();

        switch (choice) {
            case 1:
                double answer1 = calculate1aCFM();
                System.out.println("The new CFM is: " + answer1);
                break;
            case 2:
                double answer2 = calculate1aRPM();
                System.out.println("The new CFM is: " + answer2);
                break;
            case 3:
                double answer3 = calculate1aMPD();
                System.out.println("The new MPD is: " + answer3);
                break;
            case 4:
                double answer4 = calculate1aFPD();
                System.out.println("The new FPD is: " + answer4);
                break;
            case 5:
                double answer5 = calculate1bRPM();
                System.out.println("The new RPM is: " + answer5);
                break;
            case 6:
                double answer6 = calculate1bSP();
                System.out.println("The new SP is: " + answer6);
                break;
            case 7:
                double answer7 = calculate1cBHP();
                System.out.println("The new BHP is: " + answer7);
                break;
            case 8:
                double answer8 = calculate1cRPM();
                System.out.println("The new RPM is: " + answer8);
                break;
            default:
                System.out.println("Invalid choice.");
        }
    }
}
