class Car {
    String make;
    String model;
    int year;

    Car(String make, String model, int year) {
        this.make = make;
        this.model = model;
        this.year = year;
    }
    void display() {
        System.out.println("Year: " + year + ", Make: " + make + ", Model: " + model);
    }
    public static void main(String[] args) {
        Car obj1 = new Car("Toyota", "Corolla", 2021);
        obj1.display();
        Car obj2 = new Car("Ford", "Mustang", 1969);
        obj2.display();
        Car obj3 = new Car("Honda", "Civic", 2023);
        obj3.display();

    }
}
