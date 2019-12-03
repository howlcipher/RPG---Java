import java.util.Arrays;

public class character {
  //name and job of character
  String name;
  String job;

  //dice created for stat rolls
  dice d20 = new dice(20);

  //base stats
  int strength;
  int dexterity;
  int constitution;
  int wisdom;
  int intelligence;

  public character(String x, String y) {
    //need to get user input
    name = x;
    job = y;

    //returns a int[] value into int[]
    int[] stats = stats();
    //sorts the int[]
    Arrays.sort(stats);

    //currently ordered for warrior
    strength = stats[4];
    dexterity = stats[2];
    constitution = stats[3];
    wisdom = stats[1];
    intelligence = stats[1];
  }

  //
  int[] stats() {
    //index
    int i;
    //array of stats to be returned
    int[] stats = new int[5];

    //stalRoll() five times adding them to the array
    for (i = 0; i < 5; i++) {
      int roll = d20.statRoll();
      stats[i] = roll;
    }
    //returns and array of ints
    return stats;
  }

  //displays a character
  void display(character c){
      System.out.println("Name: "+c.name);
      System.out.println("Job: "+c.job);
      System.out.println("Strength: "+c.strength);
      System.out.println("Dexterity: "+c.dexterity);
      System.out.println("Constitution: "+c.constitution);
      System.out.println("Wisdom: "+c.wisdom);
      System.out.println("Intelligence: "+c.intelligence);
    }
}
