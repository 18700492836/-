package Seven;
  interface fruit{
	void type(String name);
}
public class fruitDemo implements fruit{
	@Override
	public void type(String name) {		
		System.out.println("子类的"+name+"哥哥");
	}
	public static void main(String[] args) {
		fruitDemo f=new fruitDemo();
		fruit s=(fruit)f;
		s.type("hufh");
		
	
	}	
}


