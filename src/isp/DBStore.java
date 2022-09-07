package isp;

public class DBStore implements Store{

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

	//below methods are unused -> better to segreagte one interface must have one responsiblity
	@Override
	public void AddKey() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void RecoverKey() {
		// TODO Auto-generated method stub
		
	}

	@Override
	public void Evict() {
		// TODO Auto-generated method stub
		
	}

}
