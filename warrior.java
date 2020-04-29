import java.util.Arrays;

public class warrior extends character {

    private int[] warWeight = {4,2,3,0,1};
    private stats warriorStats = new stats(warWeight);

    public warrior(String name, String job) {
        super(name, job);
    }

    void display(){
      System.out.println("Name: "+getName());
      System.out.println("Job: "+getJob());
      System.out.println("Strength: "+ warriorStats.getStrength());
      System.out.println("Dexterity: " + warriorStats.getDexterity());
      System.out.println("Constitution: " + warriorStats.getConstitution());
      System.out.println("Wisdom: " + warriorStats.getWisdom());
      System.out.println("Intelligence: " + warriorStats.getIntelligence());
    }


}
