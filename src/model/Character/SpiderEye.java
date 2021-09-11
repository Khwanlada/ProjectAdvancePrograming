package model.Character;


import model.DamageType;

public class SpiderEye extends BasedCharacter {

    public SpiderEye(String name, String imgpath,String description) {
        this.name = name;
        //this.type = DamageType.magical;
        this.type = DamageType.item;
        this.imgpath = imgpath;
        this.description = description;
        this.fullHp = 30;
        this.basedPow = 50;
        this.basedDef = basedDef;
        this.basedRes = basedRes;
        this.hp = this.fullHp;
        this.power = this.basedPow;
        this.defense = basedDef;
        this.resistance = basedRes;
        //+++++
        this.basedSpd = basedSpd;
        this.Spd = basedSpd;

    }
}
