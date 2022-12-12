public class Car {
    private String make;
    private String model;
    private int year;
    private double mpg;
    private int id;

    private static int count = 0;

    public Car(){
        this("None", "None", 0, 0.0);
    }
    public Car(String make, String model, int year, double mpg){
        this.make = make;
        this.model = model;
        if (year > 2022){
            this.year = 2022;
        }else if (1885 > year){
            this.year = 2000;
        }else {
            this.year = year;
        }
        if (mpg < 0){
            this.mpg = 0;
        }else {
            this.mpg = mpg;
        }
        count++;
        id = count;
    }

    public String toString() {
        return "ID: " + id +
                "\nMake: " + make +
                "\nModel: " + model +
                "\nYear: " + year +
                "\nMPG: " + mpg;
    }
}
