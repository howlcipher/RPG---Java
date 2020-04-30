import java.util.Random;

public class dice {
    int sides;
    Random rand = new Random();

    public dice(int x) {
        sides = x;
    }


    public int roll() {
        return rand.nextInt(this.sides + 1 - 0) + 0;
    }

    public int statRoll() {
        return rand.nextInt(20 + 1 - 8) + 8;
    }

}
