public class Warrior extends Hero{
    @Override
    public void applySuperAbility() {
        setTypeOfSuperpower("DAMAGE INCREASE");
        System.out.println("Воин применил скилл: " + getTypeOfSuperpower());
    }
}
