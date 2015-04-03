import java.util.Random;

public class Dice {


    public void computerRoll() {


        int die = roll();
        System.out.println("Dice Roll ="+ die);
    }


    int roll() {
        return (int)(6.0 * Math.random()) + 1;
    }



    public static void main(String[] args) {
        Dice var = new Dice();
        var.computerRoll();
    }

}

