public class Reimaining {

    public void remaining(Resources resources){
        System.out.println("The coffee machine has:\n" +
                resources.water + " ml of water\n" +
                resources.milk + " ml of milk\n" +
                resources.beans + " g of coffee beans\n" +
                resources.disposableCups + " disposable cups\n" +
                "$" + resources.money + " of money");
    }
}
