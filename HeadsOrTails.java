import java.util.Random;
import java.util.Scanner;

public class HeadsOrTails {
    public static void main(String[] args) {
        Random random = new Random();
        Scanner scanner = new Scanner(System.in);

        int r;
        int H = 0;
        int T = 0;

        System.out.println("Who are you?");
        System.out.print("> ");
        String name = scanner.nextLine();
        System.out.println("Hello, " + name + "!");

        scanner.close();

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

        if(H > T){
            System.out.println("You won");
        }else{
            System.out.println("You lost");
        }
    }
}