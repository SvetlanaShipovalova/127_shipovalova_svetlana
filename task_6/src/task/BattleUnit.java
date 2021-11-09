
package task;

public class BattleUnit {
    private int strength;
    private int armor;
    private int hp;
    private int x;
    private int y;

    public BattleUnit(int strength, int armor, int hp, int x, int y) {
        this.strength = strength;
        this.armor = armor;
        this.hp = hp;
        this.x = x;
        this.y = y;
    }

    public int getStrength() {
        return this.strength;
    }

    public int getArmor() {
        return this.armor;
    }

    public int getX() {
        return this.x;
    }

    public int getY() {
        return this.y;
    }

    public int getHealth() {
        return this.hp;
    }

    public void attacked(BattleUnit enemy) {
        if (this.armor > 0 && enemy.getStrength() > this.armor) {
            this.hp -= enemy.getStrength() - this.armor;
        } else if (this.armor < 0) {
            this.hp -= enemy.getStrength();
        }

    }

    public void moveUp() {
        --this.y;
    }

    public void moveDown() {
        ++this.y;
    }

    public void moveLeft() {
        --this.x;
    }

    public void moveRight() {
        ++this.x;
    }

    public boolean isAlive() {
        return this.hp > 0;
    }
}
