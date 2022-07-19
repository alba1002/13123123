

public class Main {
    public static void main(String[] args) {
        Boss boss1 = new Boss();
        boss1.setHealth(1000);
        boss1.setDamage(70);
        boss1.setSuperPower("Fly");
        boss1.setTypeDefence("Field");
        System.out.println("Health:" + boss1.getHealth() + " " + "Damage:" + boss1.getDamage() + boss1.getBossWeapon() + boss1.getSuperPower() + boss1.getTypeDefence());
    }
}