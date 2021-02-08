public class PassengerCar extends Car {
    public PassengerCar(String brand, String model, String color, String serialNumber, int maxSpeed, int speedNow, int enginePower, int engineVolume, int engineDegreeWear, int brakeBrakingRatio, int brakeDegreeWear, int bodyAirBrag, int bodyDegreeWear, int transmissionTransfer, int transmissionNumberTransfer, int transmissionDegreeWear) {
        super(brand, model, color, serialNumber, new Engine(enginePower, engineVolume, engineDegreeWear), new Brake(brakeBrakingRatio, brakeDegreeWear), new Body(bodyAirBrag, bodyDegreeWear), new Transmission(transmissionTransfer, transmissionNumberTransfer, transmissionDegreeWear), maxSpeed, speedNow);
    }

    @Override
    public void brake() {
        this.setSpeedNow(getSpeedNow() - getSpeedNow() * getBrake().getBrakingRatio() / 100);

    }
}
