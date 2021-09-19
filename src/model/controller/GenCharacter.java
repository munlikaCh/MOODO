package model.controller;

import model.Character.BasedCharacter;
import model.Character.BattleMageCharacter;

import java.util.Random;

public class GenCharacter {
    public static BasedCharacter setUpCharacter() {
        BasedCharacter character;
        Random rand = new Random();
        int type = rand.nextInt(3) +1;
        int basedDef = rand.nextInt(50) + 1;
        int basedRes = rand.nextInt(50) + 1;
        //+++
        int basedSpd = rand.nextInt(50) + 1;
        //=======

        if (type == 1) {
            character = new BattleMageCharacter("Childe", "assets/childe.png", basedDef, basedRes, basedSpd);

        }else {
            character = new BattleMageCharacter("Childe", "assets/childe.png", basedDef, basedRes, basedSpd);

        }
        return character;
    }
}
