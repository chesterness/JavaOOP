package assignment;


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

        VirtualDoctor doctor = new VirtualDoctor();
        doctor.runVirtualDoctor();

    }

}