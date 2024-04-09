public class Tranzactie extends ConversieCurrencyImpl implements Cloneable {
    private int id;
    private Payment payment;
    private Currency currency;
    private double amount;
    private Integer refNmb;

    public Tranzactie(int id, Payment payment)
    {
        super();
        this.id = id;
        this.payment = payment;
        this.currency = Currency.EUR;
        this.amount = conversieValutaToEur(payment.getAmount(), payment.getCurrency());
        this.refNmb = null;
    }

    public Tranzactie clone()
    {
        try {
            return (Tranzactie) super.clone();
        } catch (CloneNotSupportedException e) {
            return null;
        }
    }

    public int getId()
    {
        return id;
    }

    public void setId(int id)
    {
        this.id = id;
    }

    public Payment getPayment()
    {
        return payment;
    }

    public void setPayment(Payment payment)
    {
        this.payment = payment;
    }

    public Currency getCurrency()
    {
        return currency;
    }

    public void setCurrency(Currency currency)
    {
        this.currency = currency;
    }

    public double getAmount()
    {
        return amount;
    }

    public void setAmount(double amount)
    {
        this.amount = amount;
    }

    public Integer getRefNmb()
    {
        return refNmb;
    }

    public void setRefNmb(Integer refNmb)
    {
        this.refNmb = refNmb;
    }

    @Override
    public String toString()
    {
        return "Tranzactie{" +
                "id=" + id +
                ", payment=" + payment +
                ", currency=" + currency +
                ", amount=" + amount +
                ", refNmb=" + refNmb +
                '}';
    }
}
