package model.Character;


import model.DamageType;

public class PhysicalCharacter extends BasedCharacter {
//    private final int basedPow;

    public PhysicalCharacter(String name, String imgpath, int basedDef, int basedRes,int basedSpd) {
        this.name = name;
        this.type = DamageType.physical;
        this.imgpath = imgpath;
        this.fullHp = 50;
        this.basedPow = 0;
        this.basedDef = basedDef;
        this.basedRes = basedRes;
        this.hp = this.fullHp;
        this.power = this.basedPow;
        this.defense = basedDef;
        this.resistance = basedRes;
        //+++
        this.basedSpd = basedSpd;
        this.Spd = basedSpd;
    }
}
