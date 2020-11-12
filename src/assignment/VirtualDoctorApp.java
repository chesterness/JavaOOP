package assignment;


import java.util.Scanner;

public class VirtualDoctorApp {
    public static void main(String[] args) {


        //Task1:
        //Create a Virtual Doctor (VD) that can diagnose a disease based on the input information from User (U).Scenario:
        //VD: what is your temperature? possible input 36-42
        //U: 37.5
        //VD: do you have cough? possible input Yes|No
        //U: Yes
        //VD: do you have a chest pain? possible input Yes|No
        //U: No
        //VD: nothing serious, stay at home.
        //Depending on the combination of the input info (temperature, cough, chest pain),
        // the doctor must give different advices. The actual advice is up to you :)
        //Hint:
        //2.0. Use scanner to collect the answers.
        //2.1. Accumulate the answers into 3 variables
        //2.2. Use 'switch' or 'if' statements to decide what to print.

        boolean somethingWentWrong = false;
        do {
            Scanner scnr = new Scanner(System.in);
            System.out.println("Hello, I am a Virtual Doctor! Answer a couple of my questions, please.");
            System.out.println("What is your body temperature? Please use a coma, e.g.: '36,7'");
            double temperature = scnr.nextDouble();
            scnr.nextLine();
            System.out.println("Do you have cough? Please answer 'yes' or 'no'");
            String hasCough = scnr.nextLine();
            String uselessField2 = scnr.nextLine();
            System.out.println("Do you have a chest pain? Please answer 'yes' or 'no'");
            String hasChestPain = scnr.nextLine();
            String uselessField3 = scnr.nextLine();
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