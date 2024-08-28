import java.util.ArrayList;
import java.util.List;




//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {


        Product leys = new Product("Leys", 100);
        Product aqua = new Product("Акваминерале", 60);
        Product twiks = new Product("Твикс", 120);
        HotDrinksVendingMachine coffe = new HotDrinksVendingMachine();
        coffe.getProduct("Latte", 200, 60);
        coffe.getProduct("Cappuccino", 400, 70);
        coffe.getProduct("American", 100, 100);


        HotDrinks latte = new HotDrinks("Latte", 50, 60);
        HotDrinks cappuccino = new HotDrinks("Cappuccino", 80, 70);
        HotDrinks american = new HotDrinks("American", 30, 100);
        System.out.println(new HotDrinks("Ameee", 40));
        System.out.println(latte);
        System.out.println(coffe);

        List<HotDrinks> hotDrinksList = new ArrayList<>();
        hotDrinksList.add(latte);
        hotDrinksList.add(cappuccino);
        hotDrinksList.add(american);


        System.out.println("Список" + hotDrinksList);



    }}