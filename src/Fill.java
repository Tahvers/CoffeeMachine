import java.util.Scanner;

public class Fill {

    public void fill(Resources resources, Scanner sc) {

        System.out.println("Write how many ml of water you want to add: ");
        resources.water += sc.nextInt();
        System.out.println("Write how many ml of milk you want to add: ");
        resources.milk += sc.nextInt();
        System.out.println("Write how many grams of coffee beans you want to add: ");
        resources.beans += sc.nextInt();
        System.out.println("Write how many disposable cups you want to add: ");
        resources.disposableCups += sc.nextInt();
    }
}
