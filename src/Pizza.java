public class Pizza {
    private int size;
    private int price;

    public Pizza(int size, int price) {
        this.size = size;
        this.price = price;
    }

    public Pizza() {

    }

    public int getSize() {
        return size;
    }

    public void setSize(int size) {
        this.size = size;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    public String makePizza(){
       return  "尺寸：" + size +"/n" + "价格:" + price;

    }


}
