package model.Character;

import model.DamageType;

public class Melon extends BasedCharacter{
    public Melon(String name, String imgpath, String description){
        this.name = name;
        this.type = DamageType.item;
        this.imgpath = imgpath;
        this.description = description;
    }
}
