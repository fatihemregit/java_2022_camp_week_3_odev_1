package canli_yayin;

public abstract class BaseCreditManager implements IcreditManager {
	
	public abstract void Calculate();
	
	public void Save() {
		
		System.out.println("Kaydedildi");
	}
	
}
