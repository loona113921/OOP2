import java.util.ArrayList;
import java.util.List;

public class HotDrinksVendingMachine implements Wedding {

private final List<Product> productList;
private int money;

    public HotDrinksVendingMachine(List<Product> productList) {
        this.productList = productList;
    }

    public HotDrinksVendingMachine() {
        productList = new ArrayList<>();
    }


    public Product getProduct(String name) {
        for (Product product : productList) {
            if (product.getName().equals(name)) {
                money += product.getPrice();
                return  product;
            }
        }
        return  null;
    }



    public HotDrinks getProduct (String name, int volume, int temperature) {
        for (Product product : productList) {
            if (product instanceof HotDrinks) {
                if (product.getName().equals(name) && (((BottleOfWater) product).getVolume() == volume && (((HotDrinks) product).getTemperature() == temperature))) {
                    return (HotDrinks) product;
                }
            }
        }
        return null;
    }

    @Override
    public String toString() {
        return "Цена горячих напитков: " + money;
    }
}
