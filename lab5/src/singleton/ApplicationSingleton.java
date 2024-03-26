package singleton;

public class ApplicationSingleton
{
    public static void main(String args[])
    {
        DatabaseConnection dtb = DatabaseConnection.getInstance();
        dtb.connect();
        dtb.disconnect();
    }
}
