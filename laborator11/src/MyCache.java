import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends Thread
{
    private Map<Integer, StoredObject> cache = new ConcurrentHashMap<>();

    public void addToCache(int key, StoredObject value)
    {
        cache.put(key, value);
    }

    @Override
    public void run()
    {
        try {
            while (true)
            {
                Thread.sleep(2000);
                Timestamp crt = new Timestamp(System.currentTimeMillis());
                boolean allExpired = true;
                for (Map.Entry<Integer, StoredObject> entry : cache.entrySet())
                {
                    StoredObject storedObject = entry.getValue();
                    if (!storedObject.isExpired() && crt.after(storedObject.getExpirationTime()))
                    {
                        storedObject.setExpired();
                        System.out.println("Expired object with key " + entry.getKey());
                    }
                    if(!storedObject.isExpired())
                    {
                        allExpired = false;
                    }
                }
                if(allExpired)
                {
                    System.out.println("All objects have expired. The thread will now stop!");
                    break;
                }
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}