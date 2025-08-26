package game;
class Mage extends GameCharacter {
    public Mage(String name) {
        super(name, 100, 15);
    }
    
    @Override
    public void attack(GameCharacter opponent) {
        int damage = this.attackDamage;
        opponent.takeDamage(damage);
        System.out.println(this.name + " casts a fireball at " + opponent.getName() + ", dealing " + damage + " damage!");
    }

    @Override
    public void specialMove(GameCharacter opponent) {
        int damage = 30; 
        opponent.takeDamage(damage);
        System.out.println(this.name + " summons a Lightning Storm on " + opponent.getName() + ", dealing " + damage + " damage!");
    }
}