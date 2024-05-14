import java.sql.Timestamp;

public class StoredObject {
    private Object myInfo;
    private boolean expired;
    private Timestamp expirationTime;

    public StoredObject(Object myInfo)
    {
        this.myInfo = myInfo;
        this.expirationTime = new Timestamp(System.currentTimeMillis() + 300);
        this.expired = false;
    }

    public Object getMyInfo()
    {
        return myInfo;
    }

    public boolean isExpired()
    {
        return expired;
    }
    public Timestamp getExpirationTime()
    {
        return expirationTime;
    }
    public void setExpired()
    {
        expired = true;
    }
}
