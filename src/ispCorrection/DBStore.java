package ispCorrection;

//each interface is having single responsibility
public class DBStore implements DBStoreRepo {

	@Override
	public void Save() {
		System.out.println("Save Data");

	}

	@Override
	public void Update() {
		System.out.println("Update Data");

	}

	@Override
	public void Delete() {
		System.out.println("Delete Data");

	}

	@Override
	public void Fetch() {
		System.out.println("Fetch Data");

	}

}
