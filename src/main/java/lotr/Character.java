package lotr;

import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

@Getter @Setter @AllArgsConstructor
public abstract class Character {
    private int hp;
    private int power;

    public abstract void kick(Character opponent);

    public boolean isAlive(){
        return getHp() > 0;
    }

    public void setHp(int hp) {
        this.hp = hp > 0 ? hp : 0;
    }

    public String toString() {
        return this.getClass().getSimpleName() + "{hp=" + hp + ", power=" + power + "}";
    }
}
