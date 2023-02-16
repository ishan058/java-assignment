import java.util.Scanner;

public class Assignment2 {
    public static void main(String[] agrs){
        Scanner scannerObj = new Scanner(System.in);
        System.out.println("Nuclear Reactor name: JX00-XC-Hb1");
        System.out.println("Located: Japan\n");

        System.out.println("What is the name of supervisor?");
        String name = scannerObj.nextLine();

        System.out.println("What is the total number of employees?");
        int emp = scannerObj.nextInt();

        System.out.println("How many times the Nuclear waste i removed from the core?");
        int core = scannerObj.nextInt();

        System.out.println("What is the total weight of the waste produced every 1 week");
        float wei = scannerObj.nextFloat();

        System.out.println("Is Electric Motor being replaced every 18 days?Press Y for yes & N for no");
        char rep = scannerObj.next().charAt(0);

        System.out.println("What is the core average temperature (celsius) of the the Nuclear Reactor?");
        
        float temp = scannerObj.nextFloat();

        System.out.println("Total number of employees:-" + emp);
        System.out.println("Name of supervisor:-" + name);
        System.out.println("Times the Nuclear waste removed from the core:-" + core);
        System.out.println("Total weight of the waste produced every 1 week:_" + wei);
        if (rep == 'y' || rep == 'Y') {
            System.out.println("Yes, the electric Motor is being replaced every 18 days.");
        } else {
            System.out.println("No, the electric Motor isn't replaced every 18 days.");
        }

        
        System.out.println("Core Average Temperature: " + temp + "°C " + "," + (temp+273.15) + "°F");
        
        System.out.println("x-----------THANK YOU!--------------------x");

    }
}
