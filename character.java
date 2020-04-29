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
    }
}
