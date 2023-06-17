public class Skeleton extends Boss{
    int arrows;

    public int getArrows() {
        return arrows;
    }

    public void setArrows(int arrows) {
        this.arrows = arrows;
    }
    public String printInfo(){
        return (" Skeleton Health: " + super.getHealth() + " Skeleton Damage: " + super.getDamage() + " Skeleton Weapon: " + this.getWeapon() + " Arrows: " + getArrows());
    }
}
