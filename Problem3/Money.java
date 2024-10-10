package Problem3;

public class Money {

    // attributes
    private long dollars;
    private long cents;

    public Money(long dollars, long cents) {
        this.dollars = dollars;
        this.cents = cents;

       if(cents >= 100) {
           this.dollars += cents / 100;
           this.cents = cents % 100;
       }
    }

    public Money(Money money) {
        this.dollars = money.dollars;
        this.cents = money.cents;
    }

    public void Add(Money money) {
        this.dollars += money.dollars;
        this.cents += money.cents;
        if(cents >= 100) {
            this.dollars += cents / 100;
            this.cents = cents % 100;
        }

    }

    public void Subtract(Money money) {
        this.dollars -= money.dollars;
        this.cents -= money.cents;
        if (this.cents < 0) {
            this.dollars -= 1;
            this.cents += 100;

        }
    }

    public boolean equals(Object obj) {
        if (obj instanceof Money other) {
            return this.dollars == other.dollars && this.cents == other.cents;
        }
        return false;
    }

    public int compareTo(Money other) {
        int dollarComparison = Long.compare(this.dollars, other.dollars);
        if (dollarComparison != 0) {
            return dollarComparison;
        }
        return Long.compare(this.cents, other.cents);
    }

    public String toString() {
        return String.format("$%d.%02d", this.dollars, this.cents);
    }




}
