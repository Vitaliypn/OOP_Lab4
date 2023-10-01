package lotr;

import java.util.Random;

public abstract class Warrior extends Character {
    Random random = new Random();

    public Warrior(int minPower, int maxPower, int minHp, int maxHp) {
        super(0, 0);
        this.setPower(random.nextInt(maxPower - minPower + 1) + minPower);
        this.setHp(random.nextInt(maxHp - minHp + 1) + minHp);
    }

    @Override
    public void kick(Character opponent) {
        opponent.setHp(opponent.getHp() - this.getPower());
    }
}
