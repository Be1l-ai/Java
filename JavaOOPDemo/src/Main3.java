import java.util.Scanner;

public class Main3 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.print("Enter the Brand of the Car: ");
        String brand = scan.nextLine();
        System.out.print("Enter the Model of the Car: ");
        String model = scan.nextLine();
        System.out.print("Enter the year of the Car: ");
        String year = scan.nextLine();


        System.out.print("How fast does your car accelerate: ");
        int acceleration = scan.nextInt();
        if (acceleration < 0 || acceleration > 100) {
            System.out.println("Acceleration must be between 0 and 100.");
        }
        System.out.print("Enter the top speed: ");
        int top = scan.nextInt();
        if (top < 0 || top > 300) {
            System.out.println("Top speed must be between 0 and 300.");
        }
        System.out.print("How easy it is to handle: ");
        int handling = scan.nextInt();
        if (handling < 0 || handling > 100) {
            System.out.println("Handling must be between 0 and 100.");
        }

        Oop_Act2 car1 = new Oop_Act2();
        Oop_Act2 car2 = new Oop_Act2(brand, model, year, acceleration, top, handling);

        car1.show();
        car2.show();


        scan.close();
    }
}