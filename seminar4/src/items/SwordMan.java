package items;

import armor.Armor;
import weapons.Sword;

import java.util.ArrayList;
import java.util.Collection;

public class SwordMan extends Warrior<Sword> {
    public SwordMan(String name, Sword weapon,  ArrayList<Armor> n) {
        super(name, weapon, n);
    }


    @Override
    public String toString() {
        return super.toString() + " Type = SwordMan";
    }
}