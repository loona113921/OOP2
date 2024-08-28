public class HotDrinks extends BottleOfWater {

    private int temperature;


    public HotDrinks(String name, int price) {
        super(name, price);
    }

    public HotDrinks (String name, int price, int temperature) {
        super(name, price);
        this.temperature = temperature;
    }

    public int getTemperature() {
        return temperature;
    }

    public void setTemperature(int temperature) {
        this.temperature = temperature;
    }



    @Override
    public String toString() {
        return "HotDrinks{" +
                "name = " + getName() + ", price =" + getPrice() + ", temperature=" + getTemperature() +
                '}';
    }
}
