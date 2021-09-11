package model.controller;

import model.Character.BasedCharacter;
import model.Character.Melon;
import model.Character.MagicalCharacter;
import model.Character.Grass;

import java.util.Random;

public class GenCharacter {
    public static BasedCharacter setUpCharacter() {
        BasedCharacter character;
        Random rand = new Random();
//        int type = rand.nextInt(2) + 1; +++++ffff
        int type = rand.nextInt(3) + 1;
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
            character = new Melon("Melon", "assets/childe.png","Melon Slices come from destroying a Melon (Block). " +
                    "\n"+ "It reduces hunger by 1 when eaten." );
            //===========
        } else {
            character = new Grass("Grass", "assets/knight.png", "Grass is one of the most common blocks on the surfaces of maps." +"\n"+
                    "\n"+ " Grass is nearly identical to Dirt, with the main difference being that it can not be picked up by the player and placed. " +"\n"+
                    "\n"+"Dirt/Grass is required for plants like Saplings to grow. " +"\n"+
                    "\n"+"Grass doesn't fall when there are no blocks under it so its useful for creating building foundations." +"\n"+
                    "\n"+ " When Grass is destroyed Dirt is dropped, there is also a small chance that a Bone will be dropped. " +"\n"+
                    "\n"+ "When Bonemeal is used on Grass a Tall Grass will be created on top of it.");
        }
        return character;
    }
}
