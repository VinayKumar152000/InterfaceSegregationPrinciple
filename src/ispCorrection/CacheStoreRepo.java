package ispCorrection;

public interface CacheStoreRepo {

	// cachestore
	public void AddKey();

	public void RecoverKey();

	public void Evict();
}
