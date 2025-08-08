import java.util.Scanner;

public class CoffeeMachine {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        //Objects
        Resources resources = new Resources(400,540,120,9,550);
        Fill fill = new Fill();
        Buy buyCoffee = new Buy();
        Take take = new Take();
        Reimaining reimaining = new Reimaining();
        Clean clean = new Clean();

        //Boolean for exit
        boolean exit = false;

        do {
        System.out.println("Write action buy, fill, take, clean, remaining, exit");
        String action = sc.next();

        switch (action){

            case "buy":
                buyCoffee.buy(resources, sc);
                break;

            case "fill":
                fill.fill(resources, sc);
                break;

            case "take":
                take.take(resources);
                break;

            case "clean":
                clean.cleaning(resources);
                break;

            case "remaining":
                reimaining.remaining(resources);
                break;

            case "exit":
                exit = true;
                break;

            default:
                System.out.println("Unknown action");

        }

        }while (!exit);



    }
}