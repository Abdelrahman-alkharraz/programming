import java.util.Scanner;

public class Task2{ 
    private String name;
    private int year;
    private String VIN;
    private boolean issues;
    private int assessment;

    public void setInfo(String n, int y, String v, boolean i, int a) {
        name = n;
        year = y;
        if (v.length() == 17) {
            VIN = v;
        } else {
            VIN = null;
        }
        issues = i;
        if (a > 5 || a < 1) {
            assessment = 1;
        } else {
            assessment = a;
        }
    }

    public boolean generateReport() {
        if (VIN != null) {
                System.out.println("*** CARSEER Comprehensive Report ***");
                System.out.println("*** Cost 9.99 JOD ***");
                System.out.println("*** Report Date:  20/3/2023  ***");
                System.out.println("\nGeneral Information:\n");
                System.out.println("Name: " + name);
                System.out.println("Year: " + year);
                System.out.println("VIN: " + VIN);
                System.out.println("Assessment: " + assessment + " out of 5");
                if(issues ){
                System.out.println("Vehicle has several issues such as Junks, Flood, Fire, Damage, and others");}
                System.out.println("\nEnd of CARSEER report");
                return true;
            
        } else {
            System.out.println("can not generate report for invalid VIN");
            return false;
        }
    }


    public static void main(String[] args) {
        System.out.println("Enter Vehicle information in order");
        Task2 carObj = new Task2();
        Scanner input = new Scanner(System.in);
        System.out.println(" name: ");
        String name = input.nextLine();
        System.out.println(" year: ");
        int year = Integer.valueOf(input.nextLine());
        System.out.println(" VIN:  (make sure its 17 characters length, all uppercase with no spaces):");
        String VIN = input.nextLine();
        System.out.println("Vechile assessment, (enter a number from 1 to 5): ");
        int assessment = Integer.valueOf(input.nextLine());
        System.out.println("Does this vechile has issues such as damage, Fire, Flood, etc ? (enter true or false)");
        boolean issues = Boolean.valueOf(input.nextLine());
        carObj.setInfo(name, year, VIN, issues, assessment);
        carObj.generateReport();
    }
}
