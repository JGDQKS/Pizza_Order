public class HawaiiPizza extends Pizza{
    static String NAME = "水果披萨";
    String fruites;
    public HawaiiPizza(int size, int price,String fruites) {
        super(size, price);
        this.fruites = fruites;
    }

    public HawaiiPizza() {

    }

    @Override
    public String makePizza()
    {
        return "品名:" +this.NAME+super.makePizza() + "选择的水果:" + fruites;
    }
}
