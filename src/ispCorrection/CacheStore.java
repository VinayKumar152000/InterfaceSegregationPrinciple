package ispCorrection;

public class CacheStore implements CacheStoreRepo {

	@Override
	public void AddKey() {
		System.out.println("Add Key");

	}

	@Override
	public void RecoverKey() {
		System.out.println("Recover Key");

	}

	@Override
	public void Evict() {
		System.out.println("Evict Data");

	}
}
