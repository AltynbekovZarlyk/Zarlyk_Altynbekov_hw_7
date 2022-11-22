public class Magic extends Hero {

    @Override
    public void applySuperAbility() {
        setTypeOfSuperpower("THE POWER OF LIGHT");
        System.out.println("Маг применил скил: " + getTypeOfSuperpower());
    }
}
