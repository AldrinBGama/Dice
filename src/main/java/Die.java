import java.util.Random;

public class Die {
    public int sides;
    public int value;
    Random random;
    public int[] probabilities;

    public Die(int sides) {
        this.sides = sides;
    }

    public void value(int value) {
        this.value = value;
    }

    public Die(int sides , int[] probabilities) {
        this.sides=sides;
        int i =0;
        while (i<probabilities.length){
            int p = probabilities[i];
            if (p < 0){
                System.out.println ( "ERROR : negative probabilities not allowed" );}
            else if(p != probabilities[i]){
                System.out.println ("ERROR : only integer values allowed");
            }else if (p == 0) {
                System.out.println ("ERROR : probability sum must be greater than 0");
            }else if(p == probabilities[i]){
                sides=probabilities.length;
            }
            i++;
        }
    }

    public void roll() {

        random = new Random();
        if (probabilities == null) {
            int i = 0;
            while (i < sides) {
                int generateRoll = random.nextInt ( sides ) + 1;
                value ( generateRoll );
                i++;
            }
        }
    }
}

