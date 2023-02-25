import armor.*;
import items.Archer;
import items.SwordMan;
import items.Warrior;
import team.Team;
import weapons.Bow;
import weapons.Sword;

import java.lang.reflect.Array;
import java.util.ArrayList;
import java.util.Arrays;

public class Main {
    public static void main(String[] args) {
//        Team<Archer> archerTeam = new Team<>("Archers");
//        archerTeam.addWarrior(new Archer("Vasya", new Bow()), new ArrayList<Armor>())
//                .addWarrior(new Archer("Petya", new Bow()), new ArrayList<Armor>())
//                .addWarrior(new Archer("Misha", new Bow()), new ArrayList<Armor>())
//                .addWarrior(new Archer("Grisha", new Bow()), new ArrayList<Armor>());
//
//        System.out.println(archerTeam);
//
//        Team<Warrior> mixTeam = new Team<>("Mixer");
//        mixTeam.addWarrior(new Archer("Vasya", new Bow()))
//                .addWarrior(new SwordMan("Petya", new Sword()))
//                .addWarrior(new Archer("Misha", new Bow()))
//                .addWarrior(new SwordMan("Grisha", new Sword()));
//
//        System.out.println(mixTeam);
//
//        SwordMan greg = new SwordMan("Petya", new Sword());
//        Archer misha = new Archer("Misha", new Bow());
//
//        while (greg.getHealthPoint() > 0 && misha.getHealthPoint() > 0) {
//            int damage2 = misha.hitDamage(greg);
//            int damage1 = greg.hitDamage(misha);
//            System.out.printf("Здоровье Гриши: %d Здоровье Миши: %d \n", greg.getHealthPoint(), misha.getHealthPoint());
//        }
//
//        if (greg.getHealthPoint()>0)
//            System.out.println("Гриша победил");
//        else
//            System.out.println("Миша победил");
        Warrior sm = new SwordMan("greg", new Sword(), new ArrayList<>(Arrays.asList(new Helmet(), new LeatherArmor())));
        Warrior ar = new SwordMan("Гриша", new Sword(), new ArrayList<>(Arrays.asList(new SteelArmor(), new Shield())));
        Warrior ar2 = new SwordMan("Миша", new Sword(), new ArrayList<>(Arrays.asList(new Helmet(), new SteelArmor())));
        System.out.println(ar);
        System.out.println(ar2);
        while (ar.getHealthPoint() > 0 && ar2.getHealthPoint() > 0) {
            int damage2 = ar.hitDamage(ar2);
            int damage1 = ar2.hitDamage(ar);
            System.out.printf("Здоровье и броня %s: %d и %d Здоровье и броня  %s: %d %d\n", ar.getName(), ar.getHealthPoint(), ar.getArmorPoint(), ar2.getName(), ar2.getHealthPoint(), ar2.getArmorPoint());
        }

        if (ar.getHealthPoint()>0)
            System.out.println(ar.getName()+ " победил");
        else
            System.out.println(ar2.getName()+ " победил");

        Team<Archer> t1 = new Team<>("лучники");
        t1.addWarrior(new Archer("антон", new Bow(), new ArrayList<>(Arrays.asList(new Helmet(), new LeatherArmor()))))
                .addWarrior(new Archer("Сергей", new Bow(), new ArrayList<>(Arrays.asList(new LeatherArmor()))))
                .addWarrior(new Archer("Влад", new Bow(), new ArrayList<>(Arrays.asList(new Helmet(), new LeatherArmor()))));
        System.out.println(t1);
        System.out.println(t1.getMinArmor());

    }
}