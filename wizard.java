public class wizard extends character {


    private int[] wizWeight = {0, 1, 2, 3, 4};
    private stats wizardStats = new stats(wizWeight);

    public wizard(String name, String job) {
        super(name, job);
    }

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


