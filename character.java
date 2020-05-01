public class character {
    //name and job of character
    private String name;
    private String job;
    private dice d4 = new dice(4);

    //generate random weights for a created character
    public int[] randomStatPriority() {
        int[] randomStatsWeights = new int[5];
        int i;
        //need to only allow one occurrence of each number
        for (i = 0; i < 5; i++) {
            int roll = d4.roll();
            randomStatsWeights[i] = roll;
        }
        return randomStatsWeights;
    }

    //create random stats using the random weights
    private stats genStats = new stats(randomStatPriority());

    //getters and setters for name and job
    public String getName() {
        return name;
    }

    public String getJob() {
        return job;
    }

    public void setName(String name) {
        this.name = name;
    }

    public void setJob(String job) {
        this.job = job;
    }

    //general character constructor
    public character(String name, String job) {
        this.name = name;
        this.job = job;


    }

    //displays a character
    void display() {
        System.out.println("Name: " + this.name);
        System.out.println("Job: " + this.job);
        System.out.println("Strength: " + genStats.getStrength());
        System.out.println("Dexterity: " + genStats.getDexterity());
        System.out.println("Constitution: " + genStats.getConstitution());
        System.out.println("Wisdom: " + genStats.getWisdom());
        System.out.println("Intelligence: " + genStats.getIntelligence());
    }
}
