package ispCorrection;

public class Runner {

	public static void main(String args[]) {
		CacheStoreRepo cache = new CacheStore();
		cache.AddKey();
		cache.Evict();

		DBStoreRepo db = new DBStore();
		db.Save();
	}
}
