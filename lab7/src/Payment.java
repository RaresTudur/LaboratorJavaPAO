public class Payment implements Cloneable
{
    private double amount;
    private Currency currency;
    private User user;
    private String purpose;

    public Payment(double amount, Currency currency, User user, String purpose)
    {
        this.amount = amount;
        this.currency = currency;
        this.user = user;
        this.purpose = purpose;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public void setCurrency(Currency currency)
    {
        this.currency = currency;
    }

    public User getUser()
    {
        return user;
    }

    public void setUser(User user)
    {
        this.user = user;
    }

    public String getPurpose()
    {
        return purpose;
    }

    public void setPurpose(String purpose)
    {
        this.purpose = purpose;
    }
    @Override
    public Object clone()
    {
        try {
            return (Object) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    @Override
    public String toString()
    {
        return "Payment{" +
                "amount=" + amount +
                ", currency=" + currency +
                ", user=" + user +
                ", purpose='" + purpose + '\'' +
                '}';
    }
}
