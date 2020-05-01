public class wizard extends character {

    //wizard stat weight and generation
    private int[] wizWeight = {0, 1, 2, 3, 4};
    private stats wizardStats = new stats(wizWeight);

    //wizard constructor
    public wizard(String name, String job) {
        super(name, job);
    }

    //display wizard
    void display() {
        System.out.println("Name: " + getName());
        System.out.println("Job: " + getJob());
        System.out.println("Strength: " + wizardStats.getStrength());
        System.out.println("Dexterity: " + wizardStats.getDexterity());
        System.out.println("Constitution: " + wizardStats.getConstitution());
        System.out.println("Wisdom: " + wizardStats.getWisdom());
        System.out.println("Intelligence: " + wizardStats.getIntelligence());
    }


}


