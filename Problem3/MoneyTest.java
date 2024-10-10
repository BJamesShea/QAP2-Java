package Problem3;

public class MoneyTest {
    public static void main(String[] args) {
        Money money1 = new Money(5,50);
        Money money2 = new Money(10,5);
        Money money3 = new Money(5,50);

        System.out.println("Testing toString():");
        System.out.println("money1: " + money1.toString());
        System.out.println("money2: " + money2.toString());
        System.out.println();
    }


}
