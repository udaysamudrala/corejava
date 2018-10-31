package singleton;

public class SingletonApp {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
	SingletonImp s = SingletonImp.getinstance();
	SingletonImp k = SingletonImp.getinstance();
	System.out.println(k.a);
	System.out.println(s.a);

	}

}
