package homework_1;

public class Main {
    public static void main(String[] args) {

        HotDrink hotTeaSmall = new HotTea("Pu-erh black tea", 120, 300, 90);
        HotDrink hotCoffeeMedium = new HotCoffee("Piazza del Caffe", 150, 200, 80);
        HotDrink hotChocolateLarge = new HotChocolate("Lazy Barista", 130, 250, 75);

        VendingMachine hotDrinksVending = new HotDrinksVendingMachine();

        hotDrinksVending.addProduct(hotTeaSmall);
        hotDrinksVending.addProduct(hotCoffeeMedium);
        hotDrinksVending.addProduct(hotChocolateLarge);

        System.out.println(hotDrinksVending.getProduct("Pu-erh black tea"));
        System.out.println(hotDrinksVending.getProduct("Piazza del Caffe"));
        System.out.println(hotDrinksVending.getProduct("Lazy Barista"));
    }
}
