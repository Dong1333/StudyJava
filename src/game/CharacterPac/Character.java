package game.CharacterPac;

import game.WeaPonPac.WeaPon;

abstract class Character {
    private String Name;
    private int Hp;
    WeaPon weaPon;

    public Character(String name, int hp) {
        this.Name = name;
        this.Hp = hp;
    }

    public String getName() {
        return Name;
    }

    public void setName(String name) {
        Name = name;
    }

    public int getHp() {
        return Hp;
    }

    public void setHp(int hp) {
        Hp = hp;
    }

    public void dropWeapon(WeaPon weaPon){
        this.weaPon = weaPon;
    }

    public void Attack(){
        System.out.printf(this.Name + " 님이 ");
        this.weaPon.UseWeaPon();
    }
}
