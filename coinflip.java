import java.util.Random;
public class coinflip {
    public static void main(String[] args){
        Random random = new Random();
        int heads = 0;
        int tails = 0;

        for(int i = 0; i < 50; i++){
            int flip = random.nextInt(2);
            if(flip == 0){
                heads++;
            }
            else{
                tails++;
            }
        }
        System.out.println("Heads " + heads);
        System.out.println("Tails " + tails);
    }
}
