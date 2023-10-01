package lotr;

class GameManager {
    void fight(Character c1, Character c2) {
        System.out.println("Starting the fight!");
        if (c1 instanceof lotr.Hobbit && c2 instanceof lotr.Hobbit) {
            System.out.println("Both cry!");
        } else {
            while (c1.isAlive() && c2.isAlive()) {
                c1.kick(c2);
                if (c2.isAlive()) {
                    c2.kick(c1);
                }
            }
            System.out.println("Fight over!");
            if (c1.isAlive()) {
                System.out.println(c1 + " wins!");
            } else if (c2.isAlive()) {
                System.out.println(c2 + " wins!");
            }
        }
    }
}