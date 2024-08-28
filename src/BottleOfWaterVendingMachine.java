import java.util.List;

public class BottleOfWaterVendingMachine implements Wedding {

    // реализовываем тут автомат, который продает бутылки воды

    private final List<Product> productList;
    private  int money;

    public BottleOfWaterVendingMachine(List<Product> productList) {
        this.productList = productList;
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

public BottleOfWater getProduct (String name, int volume) {
        for (Product product : productList) { // пройдемся циклом по нашим продуктам и создадим условие для сопоставления нашего имени и объема
            if (product instanceof  BottleOfWater) { // условие проверяет, что продукт точно подходит по нашему классу
                if (product.getName().equals(name) && (((BottleOfWater) product).getVolume() == volume)) {
                    return (BottleOfWater) product;
                }
            }
        }
        return null;
}
}

