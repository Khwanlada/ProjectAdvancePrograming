package model.controller;

import model.DamageType;
import model.Item.Armor;
import model.Item.BasedEquipment;
import model.Item.Weapon;

import java.util.ArrayList;

public class GenItemList {
//    public static BasedEquipment[] setUpItemList() {
//        BasedEquipment[] itemLists = new BasedEquipment[5];
//        itemLists[0] = new Weapon("Sword",10, DamageType.physical,"assets/sword1.png");
//        itemLists[1] = new Weapon("Gun",20,DamageType.physical,"assets/gun1.png");
//        itemLists[2] = new Weapon("Staff",30,DamageType.magical,"assets/staff1.png");
//        itemLists[3] = new Armor("shirt",0,50,"assets/shirt1.png");
//        itemLists[4] = new Armor("armor",50,0,"assets/armor1.png");
//-------1.31
        public static ArrayList<BasedEquipment> setUpItemList() {
            ArrayList<BasedEquipment> itemLists = new ArrayList<BasedEquipment>(5);
            itemLists.add(new Weapon("Sword",10, DamageType.block,"assets/sword1.png"));
            itemLists.add(new Weapon("Gun",20,DamageType.block,"assets/gun1.png"));
            itemLists.add(new Weapon("Staff",30,DamageType.magical,"assets/staff1.png"));
            //++Bow++
            itemLists.add(new Weapon("Bow", 100,  DamageType.block, "assets/bow1.png"));
            //=======
            itemLists.add(new Armor("shirt",0,50,"assets/shirt1.png"));
            itemLists.add(new Armor("armor",50,0,"assets/armor1.png"));
            //++defense++
            itemLists.add(new Armor("defense", 98, 0, "assets/defense1.png"));
            //===========
        return itemLists;

    }
}
