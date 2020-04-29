import java.awt.print.Printable;
import java.util.Arrays;

class Main {
  public static void main(String[] args) {
    String job = "Warrior";
    switch (job.toUpperCase()){
      case "WARRIOR":
        character Thor = new warrior("Thor", job);
        Thor.display();
      default:
        System.out.println("No character created.");
        break;
    }



  }
}