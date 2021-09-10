package model.controller;

import model.Character.BasedCharacter;
import model.Character.BattleMageCharacter;
import model.Character.MagicalCharacter;
import model.Character.PhysicalCharacter;
//import model.Character.BattleMageCharacter;

import java.util.Random;

public class GenCharacter {
    public static BasedCharacter setUpCharacter() {
        BasedCharacter character;
        Random rand = new Random();
//        int type = rand.nextInt(2) + 1; +++++ffff
        int type = rand.nextInt(3) +1;
        int basedDef = rand.nextInt(50) + 1;
        int basedRes = rand.nextInt(50) + 1;
        //+++
        int basedSpd = rand.nextInt(50) + 1;
        //=======
        if (type == 1) {
            character = new MagicalCharacter("MagicChar1", "assets/wizard.png", basedDef, basedRes, basedSpd);
        }
        //++++childe++++
        else if (type == 2) {
            character = new BattleMageCharacter("BattleMageChar1", "assets/childe.png", basedDef, basedRes, basedSpd);
        //===========
        }else {
            character = new PhysicalCharacter("PhysicalChar1", "assets/knight.png",basedRes,basedRes, basedSpd);
        }
        return character;
    }
}
