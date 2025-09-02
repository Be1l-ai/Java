public class Oop_Act2 {
    String make;
    String model;
    String year;
    int acceleration;
    int top;
    int handling;

    public Oop_Act2() {
        this.make = "Mitsubitshi";
        this.model = "Eclipse";
        this.year = "1995";
        this.acceleration = 80;
        this.top = 60;
        this.handling = 30;
    }

    public Oop_Act2(String make, String model, String year, int acceleration, int top, int handling) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.acceleration = acceleration;
        this.top = top;
        this.handling = handling;
    }

    public String showbar(int value) {
        if (value == 10) {
            return "|";
        } else if (value == 20) {
            return "||";
        } else if (value == 30) {
            return "|||";
        } else if (value == 40) {
            return "||||";
        } else if (value == 50) {
            return "|||||";
        } else if (value == 60) {
            return "||||||";
        } else if (value == 70) {
            return "|||||||";
        } else if (value == 80) {
            return "||||||||";
        } else if (value == 90) {
            return "|||||||||";
        } else if (value == 100) {
            return "||||||||||";
        } else {
            return "Invalid input";
        }
    }

    public void show() {
        String bar1 = showbar(acceleration);
        String bar2 = showbar(top);
        String bar3 = showbar(handling);

        System.out.println("--===Car Information===--");
        System.out.println("Brand Name: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        
        System.out.println("--=Car Select=--");
        System.out.println("Acceleration: " + bar1 + " " + acceleration);
        System.out.println("Top Speed: " + bar2 + " " + top);
        System.out.println("Handling: " + bar3 + " " + handling);
    }
}