import java.sql.Timestamp;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

public class MyCache extends Thread
{
    private Map<Integer, StoredObject> cache = new ConcurrentHashMap<>();
    boolean running = true;

    public void addToCache(int key, StoredObject value)
    {
        cache.put(key, value);
    }

    public void stopThread() {
        running = false;
    }

    @Override
    public void run()
    {
        try {
            while (running) {
                Thread.sleep(2000);
                Timestamp crt = new Timestamp(System.currentTimeMillis());
                for (Map.Entry<Integer, StoredObject> entry : cache.entrySet())
                {
                    StoredObject storedObject = entry.getValue();
                    if (crt.after(storedObject.getExpirationTime()))
                    {
                        System.out.println("Expired object with key " + entry.getKey());
                        cache.remove(entry.getKey());
                    }
                }
            }
        } catch (InterruptedException e)
        {
            e.printStackTrace();
        }
    }
}