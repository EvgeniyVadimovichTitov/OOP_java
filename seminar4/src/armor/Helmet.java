package armor;

public class Helmet implements Armor {
    @Override
    public double getShareOfDamage() {
        return 0.07;
    }

    @Override
    public int getArmorPoint() {
        return 40;
    }

    @Override
    public String toString() {
        return String.format("Helmet{Block damage - %s, Point - %d} ", this.getShareOfDamage(), this.getArmorPoint());
    }
}
