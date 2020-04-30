public class cleric extends character {


    private int[] cleWeight = {2, 0, 3, 4, 1};
    private stats clericStats = new stats(cleWeight);

    public cleric(String name, String job) {
        super(name, job);
    }

    void display() {
        System.out.println("Name: " + getName());
        System.out.println("Job: " + getJob());
        System.out.println("Strength: " + clericStats.getStrength());
        System.out.println("Dexterity: " + clericStats.getDexterity());
        System.out.println("Constitution: " + clericStats.getConstitution());
        System.out.println("Wisdom: " + clericStats.getWisdom());
        System.out.println("Intelligence: " + clericStats.getIntelligence());
    }


}


