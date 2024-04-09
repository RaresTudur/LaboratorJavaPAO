public class ConversieCurrencyImpl implements ConversieCalcul {
    @Override
    public double conversieValutaToEur(double amount, Currency currency)
    {
        double convertedAmount = amount;

        switch (currency)
        {
            case RON:
                convertedAmount *= 0.2;
                break;
            case USD:
                convertedAmount *= 0.92;
                break;
            case GBP:
                convertedAmount *= 1.17;
                break;
            case TRY:
                convertedAmount *= 0.10;
                break;
            default:
                break;
        }
        return convertedAmount;
    }

    @Override
    public void calculRata()
    {
    }
}
