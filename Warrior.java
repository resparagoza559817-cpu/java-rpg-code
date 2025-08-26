
package game;
class Warrior extends GameCharacter {
    public Warrior(String name) {
        super(name, 120, 10);
    }

    
    @Override
    public void attack(GameCharacter opponent) {
        int damage = this.attackDamage;
        opponent.takeDamage(damage);
        System.out.println(this.name + " swings a mighty sword at " + opponent.getName() + ", dealing " + damage + " damage!");
    }

    
    @Override
    public void specialMove(GameCharacter opponent) {
        int damage = 25;
        opponent.takeDamage(damage);
        System.out.println(this.name + " uses Shield Bash on " + opponent.getName() + ", dealing " + damage + " damage!");
    }
}