import java.sql.Timestamp;

public class StoredObject {
    private Object myInfo;
    private boolean expired;
    private Timestamp expirationTime;

    public StoredObject(Object myInfo)
    {
        this.myInfo = myInfo;
        this.expirationTime = new Timestamp(System.currentTimeMillis() + + 40);
        this.expired = false;
    }

    public Object getMyInfo()
    {
        return myInfo;
    }

    public boolean isExpired()
    {
        if (!expired && expirationTime.before(new Timestamp(System.currentTimeMillis()))) {
            expired = true;
        }
        return expired;
    }
    public Timestamp getExpirationTime()
    {
        return expirationTime;
    }
}
