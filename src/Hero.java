public abstract class  Hero implements HavingSuperAbility {
    public int health;
    public int damage;
    private String typeOfSuperpower;

    public String getTypeOfSuperpower() {
        return typeOfSuperpower;
    }

    public void setTypeOfSuperpower(String typeOfSuperpower) {
        this.typeOfSuperpower = typeOfSuperpower;
    }
}
