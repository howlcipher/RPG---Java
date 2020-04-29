import java.util.Arrays;

public class character {
  //name and job of character
  private String name;
  private String job;

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



  public character(String name, String job) {
    this.name = name;
    this.job = job;

  }



  //displays a character
  void display(){
      System.out.println("Name: "+this.name);
      System.out.println("Job: "+this.job);
//      System.out.println("Strength: "+this.strength);
//      System.out.println("Dexterity: "+this.dexterity);
//      System.out.println("Constitution: "+this.constitution);
//      System.out.println("Wisdom: "+this.wisdom);
//      System.out.println("Intelligence: "+this.intelligence);
    }
}
