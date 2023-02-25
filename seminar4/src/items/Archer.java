package items;

import armor.Armor;
import weapons.Bow;

import java.util.ArrayList;
import java.util.Collection;

public class Archer extends Warrior<Bow> implements DistanceAttacker {
    private int distance;

    public Archer(String name, Bow weapon, ArrayList<Armor> n) {
        super(name, weapon, n);

        distance = weapon.getDistance() + rnd.nextInt(10);
    }

    public int getDistance() {
        return distance;
    }

    @Override
    public String toString() {
        return super.toString() + " Type = Archer{" +
                "distance=" + distance +
                '}';
    }
}