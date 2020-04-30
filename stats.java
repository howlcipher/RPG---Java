import java.util.Arrays;

public class stats {


    //dice created for stat rolls
    private dice d20 = new dice(20);

    //base stats
    private int strength;
    private int dexterity;
    private int constitution;
    private int wisdom;
    private int intelligence;

    public stats(int[] statWeight) {

        int[] statRoll = generalStats();

        //stat modifier
        for (int i = 0; i < statRoll.length; i++) {
            if (statRoll[i] >= 18) {
                statRoll[i] += 2;
            }
            if (statRoll[i] >= 16 && statRoll[i] < 18) {
                statRoll[i] += 1;
            }
            if (statRoll[i] <= 9 && statRoll[i] > 8) {
                statRoll[i] -= 1;
            }
            if (statRoll[i] <= 8) {
                statRoll[i] -= 2;
            }
        }

        Arrays.sort(statRoll);

        this.strength = statRoll[statWeight[0]];
        this.dexterity = statRoll[statWeight[1]];
        this.constitution = statRoll[statWeight[2]];
        this.wisdom = statRoll[statWeight[3]];
        this.intelligence = statRoll[statWeight[4]];
    }

    public int getStrength() {
        return strength;
    }

    public int getDexterity() {
        return dexterity;
    }

    public int getConstitution() {
        return constitution;
    }

    public int getWisdom() {
        return wisdom;
    }

    public int getIntelligence() {
        return intelligence;
    }

    public void setStrength(int strength) {
        this.strength = strength;
    }

    public void setDexterity(int dexterity) {
        this.dexterity = dexterity;
    }

    public void setConstitution(int constitution) {
        this.constitution = constitution;
    }

    public void setWisdom(int wisdom) {
        this.wisdom = wisdom;
    }

    public void setIntelligence(int intelligence) {
        this.intelligence = intelligence;
    }

    //STATS ROLL
    public int[] generalStats() {
        //index
        int i;
        //array of stats to be returned
        int[] stats = new int[5];

        //statlRoll() five times adding them to the array
        for (i = 0; i < 5; i++) {
            int roll = d20.statRoll();
            stats[i] = roll;
        }
        //returns and array of ints
        return stats;
    }


}
