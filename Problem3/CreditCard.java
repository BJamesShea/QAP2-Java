package Problem3;

public class CreditCard {
    private Money balance;
    private Money creditLimit;
    private Person owner;


    public CreditCard(Person owner, Money creditLimit) {
        this.owner = owner;
        this.creditLimit = creditLimit;
        this.balance = new Money(0,0);
    }

    public Money getBalance() {
        return balance;
    }

    public Money getCreditLimit() {
        return creditLimit;
    }

    public Person getOwner() {
        return owner;
    }

    public void Charge(Money amount) {
        Money newBalance = new Money(balance);
        newBalance.Add(amount);

        if(newBalance.compareTo(creditLimit) <= 0) {
            balance.Add(amount);
            System.out.println("Charge successful: " + amount.toString());
        } else {
            System.out.println("Charge denied: Exceeds credit limit.");
        }

    }

    public void Payment(Money amount) {

        balance.Subtract(amount);


        System.out.println("Payment successful: " + amount.toString());

    }
}
