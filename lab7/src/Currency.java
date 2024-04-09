public enum Currency {
    RON("Romania", "RO"),
    USD("United States", "USD"),
    GBP("United Kingdom", "GBP"),
    TRY("Turkey", "TRY"),
    EUR("European Union", "EUR");

    private final String country;
    private final String symbol;

    Currency(String country, String symbol)
    {
        this.country = country;
        this.symbol = symbol;
    }

    public String getCountry()
    {
        return country;
    }

    public String getSymbol()
    {
        return symbol;
    }
}
