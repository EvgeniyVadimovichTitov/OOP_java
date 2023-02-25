package items;

import armor.Armor;
import weapons.Weapon;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;
import java.util.Random;

public abstract class Warrior<T extends Weapon> implements Comparable<Warrior>{
    private String name;
    protected T weapon;
    protected Random rnd = new Random();
    private int healthPoint;
    private List<Armor> clothers = new ArrayList<>();
    private int armorPoint;
    private double blockDamage;


    public Warrior(String name, T weapon, ArrayList<Armor> n) {
        this.name = name;
        this.weapon = weapon;
        this.clothers.addAll(n);
        healthPoint = 100;
        for (Armor i: this.clothers) {
            this.armorPoint+=i.getArmorPoint();
            this.blockDamage+=i.getShareOfDamage();
        }
    }

    public int getHealthPoint() {
        return healthPoint;
    }
    public int getArmorPoint() {
        return armorPoint;
    }

    public double getBlockDamage() {
        return blockDamage;
    }


    private void reduceHealthPoint(int damage) {
        if (this.armorPoint>0) {
            int damageArmor = (int) ((this.armorPoint>damage*this.blockDamage)?damage*this.blockDamage:this.armorPoint);
            this.armorPoint-= damageArmor;
            this.healthPoint-= (damage-damageArmor);

        }
        else {this.healthPoint -= damage;}
    }

    public int hitDamage(Warrior enemy) {
        int damage = rnd.nextInt(weapon.damage());
        enemy.reduceHealthPoint(damage);
        return damage;
    }

    public int getMaxDamage() {
        return weapon.damage();
    }
    public void showClothers(){
        System.out.println(this.getName()+" одет: ");
        System.out.println(this.clothers);
    }

    public String getName() {
        return name;
    }

    @Override
    public String toString() {
        return "Warrior{" +
                "name='" + name + '\'' +
                ", weapon=" + weapon +
                ", healthPoint=" + healthPoint +
                ", armorPoint=" + armorPoint +
                ", blockDamage=" + blockDamage +
                '}';
    }

    @Override
    public int compareTo(Warrior o) {
        return ((Integer) this.armorPoint).compareTo((Integer) o.armorPoint);
    }
}
