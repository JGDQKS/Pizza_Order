import java.util.Scanner;

public class Main {
    public static void main(String[] args) {

    PizzaFactory pz = new PizzaFactory();
    System.out.println("请输入想要制作的披萨：1.培根披萨 2.水果披萨");
        Scanner scanner = new Scanner(System.in);
        int ch = scanner.nextInt();
        System.out.println(pz.getAPizza(ch).makePizza());


    }
}
