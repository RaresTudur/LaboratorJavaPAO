package singleton;

public class DatabaseConnection
{
    private static DatabaseConnection instance;
    private boolean isConnected = false;
    private DatabaseConnection()
    {}
    public static DatabaseConnection getInstance()
    {
        if(instance == null)
        {
            instance = new DatabaseConnection();
        }
        return instance;
    }
    public void connect()
    {
        if(isConnected)
        {
            System.out.println("Conexiune deja existenta la baza de date");
        }
        else
        {
            this.isConnected = true;
            System.out.println("Conexiunea la baza de data a fost un succes");
        }
    }
    public void disconnect()
    {
        if(isConnected)
        {
            System.out.println("Conexiunea a fost oprita");
        }
        else
        {
            this.isConnected = false;
            System.out.println("Conexiunea la baza de data este deja oprita");
        }
    }
}
