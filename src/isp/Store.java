package isp;

public interface Store {

	//db store
	public void Save();
	public void Update();
	public void Delete();
	public void Fetch();
	
	//cachestore
	public void AddKey();
	public void RecoverKey();
	public void Evict();
}
