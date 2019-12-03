import java.util.Random;

public class dice {
  int sides;
  Random rand = new Random();

  public dice(int x) {
    sides =x;
  }


  int roll(int x){
    return rand.nextInt(x+1-1)+1;
  }
  
   int statRoll(){
    return rand.nextInt(20+1-8)+8;
  }

}
