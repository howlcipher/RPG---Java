import java.util.Random;

public class dice {
    int sides;
    Random rand = new Random();

    //create dice with x sides
    public dice(int x) {
        sides = x;
    }

    //roll the dice with maximum number of x
    public int roll() {
        return rand.nextInt(this.sides + 1 - 0) + 0;
    }

    //d20 premade for all stat rolls
    public int statRoll() {
        return rand.nextInt(20 + 1 - 8) + 8;
    }

}
