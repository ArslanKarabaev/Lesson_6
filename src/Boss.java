public class Boss extends GameEntity{
    WeaponType weapon;

    public WeaponType getWeapon() {
        return weapon;
    }

    public void setWeapon(WeaponType weapon) {
        this.weapon = weapon;
    }

    public String printInfo(){
        return (" Boss Health: " + super.getHealth() + " Boss Damage: " + super.getDamage() + " Boss Weapon: " + this.getWeapon());
    }
}
