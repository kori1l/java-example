public class Brake extends Component {
    private int brakingRatio;

    public Brake(int brakingRatio, int degreeWear) {
        this.brakingRatio = brakingRatio;
        this.setDegreeWear(degreeWear);
    }

    public int getBrakingRatio() {
        return brakingRatio;
    }

    public void setBrakingRatio(int brakingRatio) {
        this.brakingRatio = brakingRatio;
    }

    @Override
    public String toString() {
        return "Brake{" +
                "brakingRatio=" + brakingRatio +
                '}';
    }
}
