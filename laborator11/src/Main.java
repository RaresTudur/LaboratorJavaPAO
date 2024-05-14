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

            for (int i = 3; i <= 102; i++)
            {
                try
                {
                    Thread.sleep(100);
                    StoredObject storedObject = new StoredObject("testobject" + i);
                    cache.addToCache(i, storedObject);
                } catch (InterruptedException e)
                {
                    e.printStackTrace();
                }
            }
        }
}
