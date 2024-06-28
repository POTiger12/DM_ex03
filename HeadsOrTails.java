import java.util.Random;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        int r;
        int H = 0;
        int T = 0;

        System.out.println("Tossing a coin...");
        
        for (int i = 1; i <= 3; i++) {
            int h = 0;
            int t = 0;

            System.out.print("Round " + i + ": ");
            
            for (int j = 0; j < 5; j++) {
                r = random.nextInt(2);
                if(r == 0){
                    h++;
                }else{
                    t++;
                }
            }

            if(h > t){
                System.out.println("Heads");
                H++;
            }else{
                System.out.println("Tails");
                T++;
            }
        }

        System.out.println("Heads: "+ H + ", Tails: " + T);
    }
}