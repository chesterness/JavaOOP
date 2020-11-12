package assignment;

import java.util.Scanner;

public class VirtualDoctor {
    double temperature;
    String hasCough;
    String hasChestPain;

    public void askQuestions() {
        Scanner scnr = new Scanner(System.in);
        System.out.println("Hello, I am a Virtual Doctor! Answer a couple of my questions, please.");
        System.out.println("What is your body temperature? Please use a coma, e.g.: '36,7'");
        this.temperature = scnr.nextDouble();
        scnr.nextLine();
        System.out.println("Do you have cough? Please answer 'yes' or 'no'");
        this.hasCough = scnr.nextLine();
        scnr.nextLine();
        System.out.println("Do you have a chest pain? Please answer 'yes' or 'no'");
        this.hasChestPain = scnr.nextLine();
        scnr.nextLine();
    }

    public void runVirtualDoctor() {
        boolean somethingWentWrong = false;
        do {
            askQuestions();
            if (temperature <= 34) {
                System.out.println("Your temperature is too low, you need to call a doctor.");
            } else if (temperature >= 42) {
                System.out.println("Your temperature is too high, you need to call a doctor.");
            } else if (temperature < 38 & temperature >= 36 & hasCough.equalsIgnoreCase("no") & hasChestPain.equalsIgnoreCase("no")) {
                System.out.println("It looks like everything is OK, no symptoms. I think you're healthy.");
            } else if (temperature >= 38 & hasCough.equalsIgnoreCase("yes") & hasChestPain.equalsIgnoreCase("yes")) {
                System.out.println("Hmm... I would advise you to contact a doctor.");
            } else if (temperature < 38 & temperature > 36 & hasChestPain.equalsIgnoreCase("no")) {
                System.out.println("I think there's nothing to worry about. Just take care of yourself and stay home.");
            } else {
                System.out.println("Something went wrong, try again. Please make sure that you input only accepted values.");
                somethingWentWrong = true;
            }
        } while (somethingWentWrong);
    }
}