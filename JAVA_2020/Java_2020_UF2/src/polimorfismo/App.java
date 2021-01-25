package polimorfismo;

public class App {
    public static void main(String[] args) {
        Vehicle auto01 = new Vehicle("Toyota");
        Vehicle auto02 = new Cotxe("Toyota");
        System.out.println(auto01 instanceof Cotxe);
        System.out.println(auto02 instanceof Cotxe);
        System.out.println(auto02 instanceof Vehicle);
    }

}
