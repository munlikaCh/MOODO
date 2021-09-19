package model.Character;

import model.DamageType;

public class BattleMageCharacter extends BasedCharacter{
    public BattleMageCharacter(String name, String imgpath, int basedDef, int basedRes,int basedSpd){
        this.name = name;
        this.type = DamageType.damage;
        this.imgpath = imgpath;
        this.fullHp = 40;
        this.basedPow = 0;
        this.basedDef = basedDef;
        this.basedRes = basedRes;
        this.hp = this.fullHp;
        this.power = this.basedPow;
        this.defense = basedDef;
        this.resistance = basedRes;
        this.basedSpd = basedSpd;
        this.Spd = basedSpd;
    }

}
