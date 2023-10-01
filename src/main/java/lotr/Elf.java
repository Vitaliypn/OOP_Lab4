package lotr;

public class Elf extends Character{
    public Elf() {
        super(10,10);
    }
    @Override
    public void kick(Character opponent) {
       opponent.setHp(opponent.getHp() - this.getPower()) ;
    }

}
