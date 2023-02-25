package armor;

public class SteelArmor implements Armor{
    @Override
    public double getShareOfDamage() {
        return 0.6;
    }

    @Override
    public int getArmorPoint() {
        return 300;
    }

    @Override
    public String toString() {
        return String.format("Steel Armor{Block damage - %s , Point - %d} ", getShareOfDamage(), getArmorPoint());
    }
}
