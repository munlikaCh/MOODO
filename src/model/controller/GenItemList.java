package model.controller;

import model.DamageType;
import model.Item.Armor;
import model.Item.BasedEquipment;
import model.Item.Weapon;

import java.util.ArrayList;

public class GenItemList {
        public static ArrayList<BasedEquipment> setUpItemList() {
            ArrayList<BasedEquipment> itemLists = new ArrayList<BasedEquipment>(5);
            itemLists.add(new Weapon("HAPPY",100, DamageType.magical,"assets/Smile.png"));
            itemLists.add(new Weapon("BORING",20,DamageType.magical,"assets/Boring.png"));
            itemLists.add(new Weapon("PANIC",30,DamageType.magical,"assets/Panic.png"));
            itemLists.add(new Weapon("LOVE", 100000,  DamageType.magical, "assets/Love.png"));
            itemLists.add(new Weapon("SAD",10,DamageType.magical,"assets/Sad.png"));
            itemLists.add(new Weapon("ANGRY",60,DamageType.magical,"assets/Angry.png"));
            itemLists.add(new Weapon("SICK", 1,DamageType.magical, "assets/Sick.png"));
        return itemLists;

    }
}
