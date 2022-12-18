package game;

import game.CharacterPac.Human;
import game.WeaPonPac.SuperSword;
import game.WeaPonPac.Sword;
import game.WeaPonPac.WeaPon;

public class GameStart {
    public static void main(String args[]) {
        Human human = new Human("모험가", 30);

        Sword sword = new Sword();
        Sword supersword = new SuperSword();

        human.dropWeapon(sword);
        human.Attack();
        human.dropWeapon(supersword);
        human.Attack();

    }
}
