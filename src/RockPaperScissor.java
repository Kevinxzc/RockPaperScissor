import java.util.Random;
public class RockPaperScissor {

    public static void main(String[] args) {
        Random rand = new Random();
        int num = rand.nextInt(3);  //Rock is 0,Paper is 1,Scissor is 2
            System.out.println("numero aleatorio " + num);
    }
}

