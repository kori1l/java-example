public class Body extends Component {
    private int airBrag;

    public Body(int airBrag, int degreeWear) {
        this.airBrag = airBrag;
        this.setDegreeWear(degreeWear);
    }

    public int getAirBrag() {
        return airBrag;
    }

    public void setAirBrag(int airВrag) {
        this.airBrag = airВrag;
    }

    @Override
    public String toString() {
        return "Body{" +
                "airBrag=" + airBrag +
                '}';
    }
}
