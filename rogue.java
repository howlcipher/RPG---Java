public class rogue extends character {


    private int[] rogWeight = {2, 4, 1, 0, 3};
    private stats rogueStats = new stats(rogWeight);

    public rogue(String name, String job) {
        super(name, job);
    }

    void display() {
        System.out.println("Name: " + getName());
        System.out.println("Job: " + getJob());
        System.out.println("Strength: " + rogueStats.getStrength());
        System.out.println("Dexterity: " + rogueStats.getDexterity());
        System.out.println("Constitution: " + rogueStats.getConstitution());
        System.out.println("Wisdom: " + rogueStats.getWisdom());
        System.out.println("Intelligence: " + rogueStats.getIntelligence());
    }


}


