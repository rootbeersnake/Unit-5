import java.util.Random;

public class DiceRoller {
    public static void main(String[] args) {
        System.out.println("Welcome to the Dice simulator");
        Dice Dice1 = new Dice();
        Dice Dice2 = new Dice();
        Dice1.roll();
        Dice2.roll();
        System.out.println("Not locked Dice 1 = " + Dice1.getFace());
        System.out.println("Not locked Dice 2 = " + Dice2.getFace());
        Dice1.setKey(123);
        Dice2.setKey(321);
        System.out.println("Dice 1 key has been set");
        System.out.println("Dice 2 Key has been set");
        Dice1.lock(123);
        Dice2.lock(321);
        System.out.println("Dice 1 is locked");
        System.out.println("Dice 2 is locked");
        Dice1.roll();
        Dice2.roll();
        System.out.println("Locked Dice 1 = " + Dice1.getFace());
        System.out.println("Locked Dice 2 = " + Dice2.getFace());
        Dice1.unlock(123);
        Dice2.unlock(321);
        System.out.println("Dice 1 is unlocked");
        System.out.println("Dice 2 is unlocked");
        Dice1.roll();
        Dice2.roll();
        System.out.println("Unlocked Dice 1 = " + Dice1.getFace());
        System.out.println("Unlocked Dice 2 = " + Dice2.getFace());

    }
}
