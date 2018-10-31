package singleton;

public class SingletonImp {
	static private SingletonImp single_instance = null;
	String a;
	
	
	private SingletonImp() {
		a = "Hello , Im inititalized here in this  constructor";
		
	}
	
	// static method to create only one instance of singleton class 
	
	public static   SingletonImp getinstance() {
		if (single_instance == null) {
			single_instance = new SingletonImp();}
		return single_instance;
	}

}
