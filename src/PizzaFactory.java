import java.util.Scanner;

public class PizzaFactory {


    public Pizza getAPizza(int choice) {
        Pizza pizza = new Pizza();



        switch (choice) {
            case 1:
                System.out.println("请输入培根重量");
                Scanner sc = new Scanner(System.in);
                int weight = sc.nextInt();
                System.out.println("请输入披萨大小");
                int size = sc.nextInt();
                System.out.println("请输入订单价格");
                int price = sc.nextInt();
                pizza = new BaconPizza(size, price, weight);
                break;
            case 2:
                System.out.println("请输入选择的水果");
                Scanner scanner = new Scanner(System.in);
                String fruite = scanner.nextLine();
                System.out.println("请输入披萨大小");
                int size1 = scanner.nextInt();
                System.out.println("请输入订单价格");
                int price1 = scanner.nextInt();
                pizza = new HawaiiPizza(size1, price1, fruite);
                break;
            default:break;
        }
        return pizza;
    }


}
