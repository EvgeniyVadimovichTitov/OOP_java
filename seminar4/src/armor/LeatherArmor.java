package armor;

public class LeatherArmor implements Armor{
    @Override
    public double getShareOfDamage() {
        return 0.7;
    }

    @Override
    public int getArmorPoint() {
        return 100;
    }

    @Override
    public String toString() {
        return String.format("Leather Armor{Block damage - %s, Point - %d} ", getShareOfDamage(), getArmorPoint());
    }
}
