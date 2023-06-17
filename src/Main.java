public class Main {
    public static void main(String[] args) {
        //дз
    Boss boss = new Boss();
    boss.setHealth(700);
    boss.setDamage(50);
    boss.setWeapon(WeaponType.MAGIC, "Magic Staff");
        System.out.println(" Boss Health: " + boss.getHealth() + " Boss Damage: " + boss.getDamage() + " Boss Weapon Type: " + boss.getWeaponType() + " Boss Weapon NAme" + boss.getWeaponName());

        //дз на сообразительность
        System.out.println(boss.printInfo());
        Skeleton skeleton1 = new Skeleton();
        skeleton1.setHealth(100);
        skeleton1.setDamage(10);
        skeleton1.setWeapon(WeaponType.LONG, "ARROWS");
        skeleton1.setArrows(20);

        Skeleton skeleton2 = new Skeleton();
        skeleton2.setHealth(120);
        skeleton2.setDamage(5);
        skeleton2.setWeapon(WeaponType.LONG, "ARROWS");
        skeleton2.setArrows(50);

        System.out.println(skeleton1.printInfo());
        System.out.println(skeleton2.printInfo());
    }
}