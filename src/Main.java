

public class Main {
    public static void main(String[] args) {




        Car car =new Car();
        try  {
            car.close();
        }
        catch ( RuntimeException e ) {
            car.drive();
        }

        System.out.println("  hi! ");
    }
}