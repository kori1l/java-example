public class Transmission extends Component {
    private int transfer;
    private int numberTransfer;

    public Transmission(int transfer, int numberTransfer, int degreeWear) {
        this.transfer = transfer;
        this.numberTransfer = numberTransfer;
        this.setDegreeWear(degreeWear);
    }

    public int getTransfer() {
        return transfer;
    }

    public int getNumberTransfer() {
        return numberTransfer;
    }

    public void setTransfer(int transfer) {
        this.transfer = transfer;
    }

    public void setNumberTransfer(int numberTransfer) {
        this.numberTransfer = numberTransfer;
    }

    public void upTransfer(int drive) {
        if (this.transfer < numberTransfer)
            this.transfer = drive + 1;
        this.transfer = drive;
    }

    public void downTransfer(int drive) {
        if (this.transfer > 0)
            this.transfer = drive - 1;
        this.transfer = drive;
    }

    @Override
    public String toString() {
        return "Transmission{" +
                "transfer=" + transfer +
                ", numberTransfer=" + numberTransfer +
                '}';
    }
}
