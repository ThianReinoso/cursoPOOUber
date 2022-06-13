package Java;

class Main {
    public static void main(String[] args) {
        System.out.println("Hola Mundo");

        Car car = new Car("AMQ123", new Account("Andres Herrera", "AND123"));
        car.passegenger = 4;
        car.printDataCar();

        Car car2 = new Car("QWE567", new Account("Andres Herrera", "AND123"));
        car2.license = "QWE567";
        car2.driver = "Andrea Herrera";
        car2.passegenger = 3;
        car2.printDataCar();
    }
}