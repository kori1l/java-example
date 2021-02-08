public abstract class Car {
    private String brand;
    private String model;
    private String color;
    private String serialNumber;
    private Engine engine;
    private Brake brake;
    private Body body;
    private Transmission transmission;
    private int maxSpeed;
    private int speedNow;


    public Car(String brand, String model, String color, String serialNumber, Engine engine, Brake brake, Body body, Transmission transmission, int maxSpeed, int speedNow) {
        this.brand = brand;
        this.model = model;
        this.color = color;
        this.serialNumber = serialNumber;
        this.engine = engine;
        this.brake = brake;
        this.body = body;
        this.transmission = transmission;
        this.maxSpeed = maxSpeed;
        this.speedNow = speedNow;
    }

    @Override
    public String toString() {
        return "Car{" +
                "brand='" + brand + '\'' +
                ", model='" + model + '\'' +
                ", color='" + color + '\'' +
                ", serialNumber='" + serialNumber + '\'' +
                ", engine=" + engine +
                ", brake=" + brake +
                ", body=" + body +
                ", transmission=" + transmission +
                '}';
    }

    public String getBrand() {
        return brand;
    }

    public void setBrand(String brand) {
        this.brand = brand;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getSerialNumber() {
        return serialNumber;
    }

    public void setSerialNumber(String serialNumber) {
        this.serialNumber = serialNumber;
    }

    public Engine getEngine() {
        return engine;
    }

    public void setEngine(Engine engine) {
        this.engine = engine;
    }

    public Brake getBrake() {
        return brake;
    }

    public void setBrake(Brake brake) {
        this.brake = brake;
    }

    public Body getBody() {
        return body;
    }

    public void setBody(Body body) {
        this.body = body;
    }

    public Transmission getTransmission() {
        return transmission;
    }

    public void setTransmission(Transmission transmission) {
        this.transmission = transmission;
    }

    public int getMaxSpeed() {
        return maxSpeed;
    }

    public void setMaxSpeed(int maxSpeed) {
        this.maxSpeed = maxSpeed;
    }

    public int getSpeedNow() {
        return speedNow;
    }

    public void setSpeedNow(int speedNow) {
        this.speedNow = speedNow;
    }

    public void startEngine() {
        engine.startEngine();
    }

    public void turnOffEngine() {
        engine.turnOffEngine();
    }

    public String getInfoDegreeWear() {
        return "Engine: " + engine.getDegreeWear() + "% " +
                "Brake: " + brake.getDegreeWear() + "% " +
                "Body: " + body.getDegreeWear() + "% " +
                "Transmission: " + transmission.getDegreeWear() + "% ";

    }

    public abstract void brake();
}
