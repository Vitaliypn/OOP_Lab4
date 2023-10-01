package lotr;

public class Main {
    public static void main(String[] args) {
        CharacterFactory characterFactory = new CharacterFactory();
        Character character1 = characterFactory.createCharacter();
        Character character2 = characterFactory.createCharacter();
        GameManager gameManager = new GameManager();
        System.out.println("Character 1: " + character1.toString());
        System.out.println("Character 2: " + character2.toString());
        gameManager.fight(character1, character2);
    }
}
