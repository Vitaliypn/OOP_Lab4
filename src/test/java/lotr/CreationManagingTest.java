package lotr;

import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class CreationManagingTest {
    CharacterFactory characterFactory = new CharacterFactory();
    GameManager game = new GameManager();
    Character character1 = characterFactory.createCharacter();
    Character character2 = characterFactory.createCharacter();
    @Test
    public void testIsClass() {
        assertTrue(character1 instanceof lotr.Character);
    }
    @Test
    public void testIClass() {
        assertTrue(character2 instanceof lotr.Character);
    }

    @Test
    public void testKick() {
        game.fight(character1, character2);
    }
}

