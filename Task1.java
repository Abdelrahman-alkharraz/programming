
import java.util.Scanner;
import java.util.ArrayList;

public class Task1 {

    static ArrayList<String> Vehicle_Name = new ArrayList<>();
    static ArrayList<Integer> Vehicle_Year = new ArrayList<>();

    public static void Run_program() {
        Scanner vechil = new Scanner(System.in);
        System.out.println("Do you want to start the program run? (yes/no)");
        String answer = vechil.nextLine();
        if (answer.equals("no")) {
            System.out.println("*** Exit program ***");
            System.exit(0);
        } else {
            System.out.println("*** Program start ***");
        }

        System.out.println("Do you want to add a vehicle name? Enter 1 for yes and 0 for no");
        int AddVehicle = vechil.nextInt();

        while (AddVehicle == 1) {
            System.out.println("Enter the vehicle model and year, separated by a single space, for example: LEAF 2015");
            String vehicleName = vechil.next() + " " + vechil.next();
            String[] cars = vehicleName.split(" ");
            Vehicle_Name.add(cars[0]);
            Vehicle_Year.add(Integer.valueOf(cars[1]));

            System.out.println("Enter 1 to continue adding vehicles, and 0 to stop");
            AddVehicle = vechil.nextInt();
        }

        System.out.println("Vehicle addition stopped");
      
    }

    public static void Search() {
        System.out.println("*** Search ***");
        Scanner vehicle_search = new Scanner(System.in);
        System.out.println("Which vehicle year would you like to search for?");
        int search_year = vehicle_search.nextInt();

        if (Vehicle_Year.isEmpty()) {
            System.out.println("No vehicles added yet.");
            return;
        }

        boolean found = false;
        for (int i = 0; i < Vehicle_Year.size(); i++) {
            if (Vehicle_Year.get(i).equals(search_year)) {
                System.out.println("Found vehicle year " + search_year + ": " + Vehicle_Name.get(i));
                found = true;
            }
        }

        if (!found) {
            System.out.println("There is no Vechile found in year " + search_year);
        }
        System.out.println("*** search End  Sucessflly *** ");
    }

    public static void main(String[] args) {
        Run_program();
        Search();
    }
}
