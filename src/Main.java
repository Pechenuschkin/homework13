//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        Product product1 = new Product(1, "Хлеб", 50, "Продукты");
        Product copyProduct1 = new Product(1, "Хлеб", 50, "Продукты");
        Product product2 = new Product(2, "Дрель", 350, "Инструменты");
        System.out.println(product1);
        System.out.println(copyProduct1);
        System.out.println(product2);
        System.out.println(product1.equals(copyProduct1));
        System.out.println(product1.equals(product2));
        Product[] products = {product1, copyProduct1, product2};
        Product[] products1 = {product1, copyProduct1, product1};
        Order ivan = new Order("Иван", products);
        Order copyIvan = new Order("Иван", products);
        Order ivan1 = new Order("Иван", products1);
        System.out.println(ivan);
        System.out.println(copyIvan);
        System.out.println(ivan1);
        System.out.println(ivan.equals(copyIvan));
        System.out.println(ivan.equals(ivan1));

    }
}