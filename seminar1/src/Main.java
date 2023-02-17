import java.sql.Date;

public class Main {
    public static void main(String[] args) {
        VendingMachine machine = new VendingMachine();
        machine.addProduct(new Product("Lays", 100));
        machine.addProduct(new Chocolate( 70, "Mars"));
        machine.addProduct(new Chocolate(70.99, "Twix"));
        machine.addProduct(new Product("Колокольчик", 85));
        machine.addProduct(new Perishable("Молоко Бурёнка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Коровка", 85, new Date(2023, 1, 25)));
        machine.addProduct(new Perishable("Молоко Василёк", 85, new Date(2023, 1, 25)));

        System.out.println(machine);



    }
}