import java.util.Scanner;

public class Buy {

    public boolean buy (Resources resources, Scanner sc) {
        if (resources.needCleaning){
            System.out.println("I need cleaning!");
            return false;
        }

        System.out.println("What do you want buy? 1- espresso, 2 - latte, 3 - cappuccino, back - to main menu:");
        String answerBuying = sc.next();



        if (answerBuying.equals("back")) {
            return false;
        }

        if (answerBuying.equals("1")){
            if (resources.water < 250){
                System.out.println("Sorry, not enough water!");
            } else if (resources.beans < 16) {
                System.out.println("Sorry, not enough beans!");
            } else if (resources.disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                resources.water -= 250;
                resources.beans -= 16;
                resources.disposableCups -= 1;
                resources.money += 4;
                resources.cupsMade++;
                if (resources.cupsMade == 10) {
                    resources.needCleaning = true;
                }
            }
        } else if (answerBuying.equals("2")){
            if (resources.water < 350){
                System.out.println("Sorry, not enough water!");
            } else if (resources.milk < 75) {
                System.out.println("Sorry, not enough milk!");
            } else if (resources.beans < 20) {
                System.out.println("Sorry, not enough beans!");
            } else if (resources.disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                resources.water -= 350;
                resources.milk -= 75;
                resources.beans -= 20;
                resources.disposableCups -= 1;
                resources.money += 7;
                resources.cupsMade++;
                if (resources.cupsMade == 10) {
                    resources.needCleaning = true;
                }
            }
        } else if (answerBuying.equals("3")) {
            if (resources.water < 200){
                System.out.println("Sorry, not enough water!");
            } else if (resources.milk < 100) {
                System.out.println("Sorry, not enough milk!");
            } else if (resources.beans < 12) {
                System.out.println("Sorry, not enough beans!");
            } else if (resources.disposableCups < 1) {
                System.out.println("Sorry, not enough disposable cups!");
            } else {
                System.out.println("I have enough resources, making you a coffee!");
                resources.water -= 200;
                resources.milk -= 100;
                resources.beans -= 12;
                resources.disposableCups -= 1;
                resources.money += 6;
                resources.cupsMade++;
                if (resources.cupsMade == 10) {
                    resources.needCleaning = true;
                }
            }
        }

        return true;
    }
}
