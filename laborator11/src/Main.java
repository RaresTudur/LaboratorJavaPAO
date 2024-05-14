public class Main
{
        public static void main(String[] args)
        {
            MyCache cache = new MyCache();
            cache.start();

            StoredObject storedObject1 = new StoredObject("testobject1");
            StoredObject storedObject2 = new StoredObject("testobject2");
            cache.addToCache(1, storedObject1);
            cache.addToCache(2, storedObject2);
            try
            {
                Thread.sleep(100);
            } catch (InterruptedException e)
            {
                e.printStackTrace();
            }

            for (int i = 3; i <= 102; i++)
            {
                StoredObject storedObject = new StoredObject("testobject" + i);
                cache.addToCache(i, storedObject);
                try
                {
                    Thread.sleep(100);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
            cache.stopThread();
        }
}
