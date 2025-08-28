public class car {
    int noOfWheels;
    int noOfDoors;
    int maxSpeed;
    String modelName;
    String company;
    String modelNumber;

    public car(String modelNumber, String company, String modelName, int maxSpeed, int noOfDoors, int noOfWheels) {
        this.modelNumber = modelNumber;
        this.company = company;
        this.modelName = modelName;
        this.maxSpeed = maxSpeed;
        this.noOfDoors = noOfDoors;
        this.noOfWheels = noOfWheels;
    }
    @Override
    public String toString() {
        return "My Car Name is : " + modelName;
}
    public static void main(String[] args) {
        car Car =new car("123wa","hfiu","  Dzire ",13,33,4);
        System.out.println(Car.toString());
    }
    }

