package armor;

public class Shield implements Armor{
    @Override
    public double getShareOfDamage() {
        return 0.3;
    }

    @Override
    public int getArmorPoint() {
        return 500;
    }

    @Override
    public String toString() {
        return String.format("Shield{Block damage - %s , Point - %d} " , getShareOfDamage(), getArmorPoint());
    }
}