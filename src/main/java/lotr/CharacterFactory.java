package lotr;
import java.util.Random;


class CharacterFactory {
    Character createCharacter() {
        int choice = new Random().nextInt(4);
        switch (choice) {
            case 0:
                return new Hobbit();
            case 1:
                return new Elf();
            case 2:
                return new King();
            case 3:
                return new Knight();
        }
        return createCharacter();
    }
}