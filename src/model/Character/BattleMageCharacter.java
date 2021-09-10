package model.Character;

import model.DamageType;

public class BattleMageCharacter extends BasedCharacter{
    public BattleMageCharacter(String name, String imgpath, int basedDef, int basedRes,int basedSpd){
        this.name = name;
        //+++ new character type namely battlemage +++
        //===fullHp,basedPow = 40===
        this.type = DamageType.damage;
//        this.type = DamageType.magical;
        this.imgpath = imgpath;
        this.fullHp = 40;
        this.basedPow = 40;
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
