import java.lang.invoke.StringConcatFactory;

public class Oop_Act2 {
    String make;
    String model;
    String year;
    String acceleration;
    String top;
    String handling;

    public Oop_Act2() {
        this.make = "Mitsubitshi";
        this.model = "Eclipse";
        this.year = "1995";
        this.acceleration = "80";
        this.top = "60";
        this.handling = "30";
    }

    public Oop_Act2(String make, String model, String year, String acceleration, String top, String handling) {
        this.make = make;
        this.model = model;
        this.year = year;
        this.acceleration = acceleration;
        this.top = top;
        this.handling = handling;
    }

    public void show() {
        System.out.println("--===Car Information===--");
        System.out.println("Brand Name: " + make);
        System.out.println("Model: " + model);
        System.out.println("Year: " + year);
        System.out.println("--=Car Select=--");
        System.out.println("Acceleration: " + acceleration);
        System.out.println("Top Speed: " + top);
        System.out.println("Handling: " + handling);
    }
}