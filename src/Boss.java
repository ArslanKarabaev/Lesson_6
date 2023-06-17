public class Boss extends GameEntity{
    Weapon weapon = new Weapon() ;

    public WeaponType getWeaponType() {
        return weapon.getWeaponType();
    }
    public String getWeaponName(){
        return weapon.getWeaponName();
    }

    public void setWeapon(WeaponType type, String weaponName) {

        this.weapon.setWeaponType(type);
        this.weapon.setWeaponName(weaponName);
    }

    public String printInfo(){
        return (" Boss Health: " + super.getHealth() + " Boss Damage: " + super.getDamage() + " Boss Weapon Type: " + this.getWeaponType() + " Boss Weapon Name: " + this.getWeaponName());
    }
}
