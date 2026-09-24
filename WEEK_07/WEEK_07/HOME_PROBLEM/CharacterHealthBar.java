package WEEK_07.HOME_PROBLEM;

public class CharacterHealthBar {

    static class Character {

        private final int maxHealth;
        private int health;

        Character(int maxHealth) {
            this.maxHealth = maxHealth;
            this.health = maxHealth;
        }

        public void takeDamage(int amount) {
            if (amount < 0) {
                return;
            }
            health = Math.max(0, health - amount);           // floor at 0
        }

        public void heal(int amount) {
            if (amount < 0) {
                return;
            }
            health = Math.min(maxHealth, health + amount);   // cap at max
        }

        public int getHealth() {
            return health;
        }

        public int getMaxHealth() {
            return maxHealth;
        }
    }

    public static void main(String[] args) {

        Character c = new Character(100);

        c.takeDamage(30);
        System.out.println("takeDamage(30) -> health = " + c.getHealth());

        c.heal(50);
        System.out.println("heal(50) -> health = " + c.getHealth() + " (capped)");

        c.takeDamage(150);
        System.out.println("takeDamage(150) -> health = " + c.getHealth() + " (floored)");
    }
}
