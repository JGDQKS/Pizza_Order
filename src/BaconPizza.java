public class BaconPizza extends Pizza {

    int weight;
    static String NAME = "培根披萨";

    public BaconPizza(int size, int price, int weight) {
        super(size, price);
        this.weight = weight;
    }

    public BaconPizza() {

    }

    @Override
    public String makePizza(){
        return "品名:" +this.NAME+super.makePizza() + "培根的重量:" + weight;
    }


}
