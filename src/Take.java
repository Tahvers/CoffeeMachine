public class Take {

    public void take (Resources resources){
        System.out.println("I gave you $" + resources.money);

        resources.money -= resources.money;
    }
}
