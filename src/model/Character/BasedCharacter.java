package model.Character;

import model.DamageType;
import model.Item.Armor;
import model.Item.Weapon;
//import model.Item.Bow;

public class BasedCharacter {
    protected String name, imgpath;
    protected DamageType type;
    //    protected Integer fullHp, basedDef, basedDef, basedRes;
    protected Integer fullHp, basedDef,basedPow, basedRes,basedSpd;
    protected Integer hp, power, defense, resistance,Spd;
    protected Weapon weapon;
    protected Armor armor;

    public String getName () { return name; }
    public String getImagepath() { return imgpath; }
    public Integer getHp() { return hp; }
    public Integer getFullHp() { return fullHp; }
    public Integer getPower() { return power; }
    public Integer getDefense() { return defense; }
    public Integer getResistance() { return resistance; }
    //++++
    public Integer getSpd() {
        return Spd;
    }
    //====

    //-----1.40------
    public void equipWeapon(Weapon weapon) {
        this.weapon = weapon;
        this.power = this.basedPow + weapon.getPower();
        //++++
        if (this.basedSpd + weapon.getSpd() <= 50) {
            this.Spd = this.basedSpd + weapon.getSpd();
        }else {
            this.Spd = 50;
        }
        //=======
        //        if(weapon == null){
//            power = basedPow;
//        }else {
//            power = this.basedPow + weapon.getPower();
//        }
    }
    public void equipArmor( Armor armor) {
        this.armor = armor;
        this.defense = this.basedDef + armor.getDefense();
        this.resistance = this.basedRes + armor.getResistance();
    }
    //---------------


    @Override
    public String toString() { return name; }


    public DamageType getType() {
        return type;
    }

}
