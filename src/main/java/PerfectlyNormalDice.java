public class PerfectlyNormalDice {
    public int Dice() {
        double rand = Math.random();
        int roll;

        if (rand < 1.0/8.0) {
            roll = 1;
        } else if (rand < 2.0/8.0) {
            roll = 2;
        } else if (rand < 3.0/8.0)
            roll = 3;
        else if (rand < 4.0/8.0)
            roll = 4;
        else if (rand < 5.0/8.0) {
            roll = 5;
        } else
            roll = 6;
        return roll;
    }
}
