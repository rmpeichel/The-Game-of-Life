package components;

public class LifeTile {

    private int amount;

    public LifeTile(int amount) {
        this.amount = amount;
    }

    public int getAmount() {
        return amount;
    }

    public String toString() {
        return "LIFE Tile : " + "$" + amount;
    }
}
