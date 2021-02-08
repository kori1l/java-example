public class Engine extends Component {
    private int power;
    private int volume;
    private boolean launchState;

    public Engine(int power, int volume, int degreeWear) {
        this.setDegreeWear(degreeWear);
        this.power = power;
        this.volume = volume;
        this.launchState = true;
    }


    public int getPower() {
        return power;
    }

    public void setPower(int power) {
        this.power = power;
    }

    public int getVolume() {
        return volume;
    }

    public void setVolume(int volume) {
        this.volume = volume;
    }

    @Override
    public String toString() {
        return "Engine{" +
                "power=" + power +
                ", volume=" + volume +
                ", launchState=" + launchState +
                '}';
    }

    public void startEngine() {
        if (this.getDegreeWear() < 100)
            this.launchState = true;
        this.launchState = false;
    }

    public void turnOffEngine() {
        this.launchState = false;
    }
}
