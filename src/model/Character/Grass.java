package model.Character;


import model.DamageType;

public class Grass extends BasedCharacter {
//    private final int basedPow;

    public Grass(String name, String imgpath, String description) {
        this.name = name;
        this.type = DamageType.block;
        this.imgpath = imgpath;
        this.description = description;
    }
}
