package Problem3;

public class CreditCardDemo {
    public static void main(String[] args) {

        Address address = new Address("4 Rockstar Road", "Austin", "NH", "40254");
        Person owner = new Person("Morgan", "Arthur", address);


        Money creditLimit = new Money(1000, 0);


        CreditCard card = new CreditCard(owner, creditLimit);


        Money chargeAmount1 = new Money(200, 0);
        System.out.println("Attempting to charge $200...");
        card.Charge(chargeAmount1);
        System.out.println("Current balance: " + card.getBalance().toString());


        Money paymentAmount1 = new Money(50, 0);
        System.out.println("Attempting to make a $50 payment...");
        card.Payment(paymentAmount1);
        System.out.println("Current balance: " + card.getBalance().toString());


        System.out.println("Card owner info: " + card.getOwner().toString());
    }
}
