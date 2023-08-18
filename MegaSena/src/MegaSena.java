import java.util.Random;

public class MegaSena {
    public static void main(String[] args){
        int num;
        Random generate = new Random();

        //WHILE (true) -> loop infinito
        //while(i < 6) -> loop com saída
        //;
        // ==== WHILE LOOP ===
        /*
        while(i < 6) {
            num = generate.nextInt(60);
            System.out.println(num);
            ;
        }*/
        // === FOR LOOP ==
        for(int i = 0;i < 6;i++) {
            num = generate.nextInt(60);
            System.out.println(num);
        }
    }
}
